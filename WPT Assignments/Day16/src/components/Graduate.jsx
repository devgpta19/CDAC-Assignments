function Graduate(){

    return(
        <>
        {/* degree, year, final year score, univ */}
            <div className="G_dets">
                <label htmlFor="degree">Which Degree: </label>
                <input type="text" name="degree" />
                <label htmlFor="Gy">Graduation Year: </label>
                <input type="text" name="Gy" />
                <label htmlFor="clg">Which College: </label>
                <input type="text" name="clg" />
                <label htmlFor="score">Final Year Score: </label>
                <input type="text" name="score" />
            </div>
        </>
    )

}
export default Graduate;