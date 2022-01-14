package com.company;

public class GormanSlacks extends Colleague {
//Esta parte intelliJ la generó en automático, casualmente es identico (a excepción del sysout) a lo que el señor del ejemplo escribió en su netbeans ide al momento de realizar este ejercicio. Pero realmente no sé porque es necesaria ni para que se usa. Lo que si noté fue que, intelliJ pidió generar el bloque despues de haber escrito extends Colleague.

    public GormanSlacks(Mediator newMediator) {
        super(newMediator);
        System.out.println("Gorman Slacks signed up for the exchage \n");
    }
}
