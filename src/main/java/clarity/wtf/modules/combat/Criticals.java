package clarity.wtf.modules.combat;

import clarity.wtf.events.AttackEvent;
import clarity.wtf.modules.Category;
import clarity.wtf.modules.ModuleInfo;
import clarity.wtf.modules.Module;
import org.greenrobot.eventbus.Subscribe;

@ModuleInfo(name = "Criticals", description = "Makes all attacks critical hits", category = Category.COMBAT)
public class Criticals extends Module {

    public Criticals() {
        super("Criticals", "Makes all attacks critical hits", Category.COMBAT);
    }

    // no clue how to do this sooo its someone elses problem now...fuck you joshieman

    // note this is POST for some reason idfk someone elses problem now - kwenma

    @Subscribe
    public void onAttack(AttackEvent event) {
        mc.thePlayer.jump();
        System.out.println("Attacked entity: " + event.getTargetEntity());
    }
}