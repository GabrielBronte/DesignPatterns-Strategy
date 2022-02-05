import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    @Test
    void deveRetornarSalarioFightofNight() {
        Fighter fighter = new Fighter();
        fighter.paymentsFightofNight(350000.0f);
        assertEquals(400000.0f, fighter.getSalaries());
    }

    @Test
    void deveRetornarSalarioKOofNight() {
        Fighter fighter = new Fighter();
        fighter.paymentsKOofNight(350000.0f);
        assertEquals(385000.0f, fighter.getSalaries());
    }

    @Test
    void deveRetornarSalarioSubmissionofNight() {
        Fighter fighter = new Fighter();
        fighter.paymentsSubmissionofNight(350000.0f);
        assertEquals(380000.0f, fighter.getSalaries());
    }

    @Test
    void deveRetornarSalarioFalhaPesagem() {
        Fighter fighter = new Fighter();
        fighter.paymentsFailedWeighing(350000.0f);
        assertEquals(175000.0f, fighter.getSalaries());
    }

}