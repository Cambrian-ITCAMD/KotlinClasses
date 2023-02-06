/*
    name
    email
    id
    courses*
    grades*
    program
    cameraIsOn
 */

class Student(
    name: String,
    id: Int,
    program: String,
    cameraIsOn: Boolean = false,
    courses: MutableList<String> = mutableListOf(),
    grades: MutableList<Float> = mutableListOf(),
) {
    private var name = name
    private var id = id
    private var program = program
    private var cameraIsOn = cameraIsOn
    private var courses = courses
    private var grades = grades
    var email: String
    var stringID: String

    init {
        stringID = "A00" + id
        email = stringID + "@mycambrian.ca"
    }

    // this is a secondary constructor. It *must* call the primary constructor
    constructor(
        name: String,
        id: Int,
        program: String,
        cameraIsOn: Boolean,
        courses: MutableList<String>,
        grades: MutableList<Float>,
        email: String,
        stringID: String,
    ) : this(name, id, program, cameraIsOn, courses, grades){
        this.email = email
        this.stringID = stringID
    }

    fun getName(): String = this.name
    fun getId(): String = this.stringID
    fun getProgram(): String = this.program
    fun isCameraOn(): Boolean = this.cameraIsOn
    fun getCourses(): MutableList<String>{
        return courses
    }

    fun getStringifiedID(): String = "A00" + id

    fun setGrade(course: String, value: Float) {
        if(value <= 100 && value >= 0){
            val index = courses.indexOf(course)
            this.grades[index] = value
        }
    }
}