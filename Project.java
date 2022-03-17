import java.util.Calendar;

public class Project {

	private String projectName;
	private Calendar startDate;
	private boolean state;

	public Project(String projectName, Calendar startDate, boolean state) {
		super();
		this.projectName = projectName;
		this.startDate = startDate;
		this.state = state;
	}

	public void setState(String state) {
		if (state.equals("Close")) {
			this.state = false;
		} else if (state.equals("Open")) {
			this.state = true;
		} else {
			System.out.println("Unknown state.");
		}
	}

	public String getState() {
		if (state) {
			return "Open";

		}
		return "Close";
	}
	
	public void close() {
		if (state) {
			state = false;
		}
	}
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", startDate=" + startDate + ", state=" + state + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
