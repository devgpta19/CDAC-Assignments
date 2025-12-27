using System.Collections.Generic;
using System.Reflection;
using System.Reflection.Metadata;
namespace _007_Day_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //C: \Users\IET\Desktop\CDAC Assignments\Devansh0018\C#_.NET_0018\ConsoleApp2\007_ClassLib_MyMath\bin\Debug\007_ClassLib_MyMath.dll"
            string AssemblyPath = @"C:\Users\IET\Desktop\CDAC Assignments\Devansh0018\C#_.NET_0018\ConsoleApp2\007_ClassLib_MyMath\bin\Debug\007_ClassLib_MyMath.dll";
            Assembly asm = Assembly.LoadFrom(AssemblyPath);
            String methodSignature = "";
            Type[] alltype = asm.GetTypes();
            foreach (Type type in alltype)
            {
                Console.WriteLine(type.FullName);
                object dinamicallyCreatredObj = asm.CreateInstance(type.FullName);
                methodSignature += dinamicallyCreatredObj.ToString();
                MethodInfo[] minfo = type.GetMethods().ToArray();
                foreach (MethodInfo mi in minfo)
                {
                    ParameterInfo[] parameters = mi.GetParameters().ToArray();
                    methodSignature = mi.ReturnType.ToString() + " " + mi.Name + "(";

                    for (int p = 0; p < parameters.Length; p++)
                    {
                        ParameterInfo para = parameters[p];
                        Console.WriteLine($"Enter value for {para.Name} of type = {para.ParameterType.ToString()}");
                        methodSignature = methodSignature + para.ParameterType.ToString() + " " + para.Name + ",";
                    }

                    object[] inputValues = new object[parameters.Length];

                    for (int i = 0; i < parameters.Length; i++)
                    {
                        ParameterInfo para = parameters[i];
                        Console.WriteLine($"Enter value for {para.Name} of type = {para.ParameterType.ToString()}");

                        inputValues[i] = Convert.ChangeType(Console.ReadLine(), para.ParameterType);
                    }

                    methodSignature = methodSignature.TrimEnd(',') + ")";
                    Console.WriteLine(methodSignature);

                    object? result = type.InvokeMember(
                        mi.Name,
                        BindingFlags.Public |
                        BindingFlags.Instance |
                        BindingFlags.InvokeMethod,
                        null,
                        dinamicallyCreatredObj,
                        inputValues
                        );
                    Console.WriteLine($"{mi.Name} = {result}");
                }

            }
        }
    }
}
