function PostGraduate(){

    return(
        <>
        {/* year, Thesis subject */}
            <div className="PG_dets">

                <label htmlFor="ts">Thesis Subject: </label>
                <input type="text" name="ts" />
                <label htmlFor="PGy">Graduation Year: </label>
                <input type="text" name="PGy" />
               
            </div>
        </>
    )

}
export default PostGraduate;