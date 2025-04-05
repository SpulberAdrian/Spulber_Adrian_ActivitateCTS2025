public interface IBuilder {
    Internare buildInternare();
    IBuilder patRabatabil(Boolean patRabatabil);
    IBuilder micDejun(Boolean micDejun);
    IBuilder papuciDeCamera(Boolean papuciDeCamera);
    IBuilder halat(Boolean halat);
}
