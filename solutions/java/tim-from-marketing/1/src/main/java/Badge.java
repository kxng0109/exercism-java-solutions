class Badge {
    public String print(Integer id, String name, String department) {
		department = (department != null ? department : "owner").toUpperCase();
		return id != null ? String.format("[%d] - %s - %s", id, name, department)
						  : String.format("%s - %s", name, department);
    }
}
