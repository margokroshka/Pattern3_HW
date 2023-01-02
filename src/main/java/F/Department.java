package F;

public abstract class Department {
    public String recruit() {
        Worker worker = getWorker();
        return "Вы будете вот так работать '" + worker.Work()
                + "'. И вот так отдыхать '" + worker.Relax()+ "'.";
    }
    abstract Worker getWorker();
}
