package org.overstock.producers;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.Schema;
import org.apache.pulsar.shade.com.google.gson.Gson;
import org.overstock.pojos.Foo;

import java.util.Date;

public class JasonProducer {

    public static String topic = "json_topic";

    public static void main(String[] args) throws Exception
    {
        try (PulsarClient client = PulsarClient.builder().serviceUrl("pulsar://localhost:6650").build();
             Producer producer = client.newProducer(Schema.STRING).topic(topic).create();)
        {
            Gson gson = new Gson();
            long startTime = new Date().getTime();
            int i = 0;
            while (i < 100000)
            {
                Foo foo = new Foo();
                foo.setField1(i);
                foo.setField2("Lorem ipsum dolor sit amet, scelerisque magna sed aptent sapien sodales, in adipiscing in urna a elit, eu arcu nulla sem condimentum ac, molestie nascetur nec pharetra mauris dolor. Ac massa etiam praesent porttitor aliquam, pede nulla ornare lacus placerat dolor mollis, in wisi voluptatem ullamcorper egestas eget gravida, ultrices gravida id erat nunc ligula, mauris gravida est elit sed nullam. Id justo viverra iaculis urna congue, suspendisse eget est vestibulum et pellentesque, sed duis malesuada nullam id ligula massa. Nisl penatibus erat sed donec dui vel, erat praesent litora in sapien hendrerit, sint fringilla ante aliquet lobortis sollicitudin, aliquam est nulla consequat mauris enim consequat, interdum curabitur enim massa sit mauris. Ante vitae sit quam magna vitae etiam, malesuada nullam porttitor sapien quis leo, mauris lorem tortor nisl pellentesque quam ante. Est turpis lacus leo curabitur adipiscing mauris, cursus a mi non maecenas vitae quidem, neque eros ultrices molestie cras vestibulum aliquet. Bibendum dui malesuada felis tempor curabitur fringilla, suspendisse ac leo ipsum mollis eros, ut congue nulla tellus vivamus sodales, viverra lacinia justo lacus velit quis commodo, lacinia scelerisque fusce consectetuer in congue. In et nullam tristique est malesuada, ut lectus pede pede elit semper, facilisis libero in non dignissim cubilia. Commodo diam aliquet malesuada curabitur tincidunt posuere, tellus congue etiam praesent nostra at blandit, duis eleifend dui vehicula rutrum ornare, gravida urna pede massa sapien urna libero. At per magna sem vivamus vestibulum dapibus, condimentum id augue nunc enim erat, pellentesque purus interdum tristique primis non. Wisi sapien volutpat litora velit consectetuer, ultrices tincidunt amet repellat auctor sed, id tortor auctor leo in integer vitae.\n" +
                        "\n" +
                        "Eu mauris pede sollicitudin habitasse nibh, pulvinar placerat consectetuer mauris sed curabitur dictum, ullamcorper sem iaculis scelerisque eros fermentum pellentesque, maecenas nunc sed lorem sed mi, id ullamcorper aliquet mauris in eget. Fusce in et in laoreet egestas, id leo turpis sem eget in, venenatis amet amet arcu metus pellentesque volutpat, bibendum turpis dapibus vulputate cupidatat turpis risus, euismod interdum non massa lectus urna. Sapien volutpat nam in quis lacus, elit sed quis amet nec arcu fames, neque etiam vel urna suscipit nullam morbi, nibh sed ipsum orci vitae praesent. Vel pellentesque eu ut praesent ac quis, vel sem ut in volutpat suspendisse, vivamus pulvinar a congue non adipiscing, mattis ante integer massa vestibulum odio pharetra. Quam viverra ex fringilla sed ipsum, a phasellus a sapien aut vitae quam, id ut montes posuere eros proin, justo dui tincidunt accumsan quisque nisl tempor, dolor ante vel cras dolor eu tincidunt. Duis mollis volutpat arcu facilisi potenti, scelerisque a ipsum nec consequat dolor non, arcu eros mus optio libero duis. Ac vitae nullam dictumst urna risus feugiat, parturient semper massa eget nulla libero sem, aenean ligula leo ut class praesent, sapien id ac tortor imperdiet praesent, condimentum mattis vestibulum sed eros sit sunt. Dolor nisl aliquam wisi ac erat, et dictum orci eu tincidunt tempus condimentum, dui nunc sed tempor nibh ac. Amet facilisis donec tellus praesent non ullamcorper, aliquam vehicula elit mattis tincidunt sed eget, amet sed dictumst vivamus iaculis libero, vitae curabitur mauris euismod lectus nec. Pellentesque ut consectetuer aliquam nulla rutrum, lectus sociosqu rutrum dignissim in malesuada, quis sit vel vitae consequat nibh.\n" +
                        "\n" +
                        "Velit imperdiet quisque faucibus porttitor volutpat, lorem gravida voluptatem sodales amet lacus morbi, in risus litora mauris arcu erat, suscipit mauris adipiscing feugiat lectus quisque eros, nullam ac sit duis nullam justo. Explicabo dapibus libero vel consectetuer nam tellus, ut mollis adipiscing est curabitur accumsan in, orci placerat in adipiscing felis turpis, ipsum sed aenean sodales turpis quam, felis enim morbi rhoncus a praesent. Amet tincidunt aptent lectus sed elit, sit pellentesque per augue commodo id, vestibulum egestas velit aut rutrum accusantium neque, ante scelerisque mattis scelerisque mus varius metus. Tellus arcu massa pede aliquet pede est, porttitor vestibulum libero erat cras quisque, suspendisse eget elit purus augue tempor varius. Nunc in est duis mollis vestibulum turpis, arcu a risus nibh purus nunc, nullam ornare duis nibh justo in ipsum, mi et urna sollicitudin etiam non lobortis. Dolor wisi pede turpis tincidunt nec, molestie tortor vestibulum eros sit placerat at, mauris etiam est platea morbi feugiat. Magna enim arcu vestibulum blandit cras id, nulla sed ac ut nec id, luctus ornare eget a sit cursus suspendisse. Rutrum nulla tellus placerat sed felis, praesent sed ut ut lorem vitae, vel sodales convallis consectetuer aliquam sed risus. Ante integer metus maecenas at leo, quam nunc cursus orci commodo mi urna, tempus dui ultrices fermentum aliquam quo, erat enim bibendum arcu ac ipsum ut, dui purus quis saepe libero proin. Sint nascetur libero wisi neque quis, feugiat donec id purus egestas suscipit, libero nec rutrum ut lacus duis, temporibus odio auctor non dapibus id et, donec dolor mauris mus lectus aliquam. Velit nec luctus justo sapien dolor nulla, nulla penatibus congue elementum pharetra eros in, faucibus elit sed amet ultricies lacinia at.\n" +
                        "\n" +
                        "Mattis lectus ante neque odio curabitur, ridiculus in sem ut egestas mauris dis, sit non in accumsan ipsum dolor. Conubia sollicitudin risus ac in ac sed, ipsum eget purus in at vivamus viverra, lobortis eget commodo ligula ut ornare rerum, nulla suspendisse auctor wisi malesuada facilisis ex. Tristique posuere at mi ultricies egestas tincidunt, nullam taciti risus in arcu pellentesque, viverra a eu donec auctor vivamus euismod. Eget est suscipit sed justo tortor sed, eu rhoncus malesuada maecenas nulla elit, in ante mauris fusce nunc pede placerat, at tempor sociis ornare sed ut maecenas, sapien diam praesent ligula ipsum hendrerit natoque. Lobortis luctus dui porta lacinia pellentesque, aliquam vitae felis dui nullam nec eros, nisl eget nam accumsan massa molestie, aenean volutpat egestas a pellentesque quis iusto, lacinia mauris risus non nec pellentesque. Ultricies accumsan in semper fusce adipiscing, sem incididunt vel ligula nec nibh, augue scelerisque convallis ac orci sed. Id a nascetur ut eu id nullam, vel vel eget vitae sed erat fringilla, enim rhoncus pede fringilla wisi arcu nunc, ut facilisis lectus arcu mauris purus laborum, occaecat sed sed lacus quis morbi. Morbi dui nunc ad justo mollis, cras in enim suspendisse aliquam vestibulum nec, eget a diam metus condimentum ut. Lectus eget amet diam vel amet, lectus nec id conubia donec aptent pellentesque, facilisi quis at dolor fringilla velit, nec orci quis quis feugiat sed, maecenas dui amet nunc sit turpis.\n" +
                        "\n" +
                        "Pulvinar in id sapien odio sapien, pede semper interdum amet eu sit, euismod accumsan nostra et et quis. Morbi tellus vel non lorem dictumst, augue lacus sodales placerat morbi in, varius sagittis massa nibh tempor dui at, ultrices nec natoque sed ipsum laoreet metus, metus tellus sed ac per vitae. Dui semper fringilla suscipit venenatis convallis vestibulum, neque sodales ac et interdum non augue, sit et posuere suscipit vehicula leo vel, interdum in morbi vestibulum platea hendrerit in, non placerat nec nulla euismod congue. A consectetuer ducimus tellus sit massa, ut et sagittis felis urna porta, ut arcu dignissim massa fermentum sit vulputate, lorem consequat vulputate lacus vivamus tincidunt aliquam. Commodo sint euismod pharetra euismod nullam, amet ut vivamus turpis aliquam rhoncus, wisi eu vestibulum rhoncus id mollis et, vel vel consectetuer a facilisi diam placerat, metus donec aptent mi etiam repellat fusce. Augue et ut velit morbi donec etiam, egestas et ut aenean ipsum egestas vitae, et lorem nulla pede quis fusce, non nonummy odio maecenas rutrum risus. Interdum in ac in egestas eget, dictum quis est vitae pellentesque at, ut praesent facilisi in enim et. Porta egestas odio commodo ligula blandit semper, tortor laoreet pellentesque nunc proin scelerisque nunc, ridiculus pellentesque curae augue orci torquent, rem ac orci vivamus imperdiet velit ipsum, eu porttitor fermentum augue neque felis eleifend. Est sociosqu amet ac sodales molestie, dictum pede mauris dolor neque dignissim magnis, fringilla etiam ut nibh elit erat dui, urna ac cras mi elit pulvinar, sociosqu lacus id mus in elit elit. Sapien in malesuada massa fermentum lectus, nec ipsum et cum ipsum nulla aliquam, suspendisse phasellus consectetuer dui vel pede quis, porta sodales officia dictum fusce consequat volutpat. In nec lobortis augue ut egestas vehicula, id lectus nullam lectus sem morbi feugiat, consectetuer augue sed arcu fermentum quisque, dictumst justo scelerisque non nunc mi lacinia, nec dapibus aliquet ipsum magnis ipsum. Suscipit sint aliquet integer quis sapien, purus magnis cursus facilisis impedit elit commodo, sagittis in eu nulla quis eget at.\n" +
                        "\n" +
                        "Volutpat platea nulla proin nisl quis, fusce quisque urna placerat vivamus platea lobortis, id duis sem massa vel erat. Sed arcu auctor quis pellentesque donec, ut ut fermentum dolor parturient velit, proin feugiat accumsan augue amet erat mus. Non dui faucibus nibh id nulla aenean, egestas leo semper in fusce magna tellus, mattis mauris torquent tempus netus blandit. Ac quisque nibh rutrum pulvinar vestibulum penatibus, sodales interdum libero id libero pretium orci, nullam mus tortor eros convallis integer leo, sapien augue laoreet enim mollis vitae vestibulum, suscipit natoque pellentesque quia donec orci dis. Mauris torquent ultricies vitae amet pulvinar, adipiscing suspendisse nascetur tellus id sem rutrum, tortor molestie neque donec odio urna, pretium vulputate et et dapibus pulvinar, libero suspendisse habitasse nibh lectus etiam mattis. Diam morbi mi tortor risus imperdiet, consequat erat euismod laoreet neque pretium justo, amet eros erat auctor elit in, nec quam porttitor convallis et velit quis, ut id facilisis eu lacus amet. Eget laoreet vel quis lacus a praesent, viverra ipsum fames tortor risus placerat, convallis pharetra donec semper velit sit. A pulvinar eleifend rem neque imperdiet accumsan, wisi massa vestibulum enim eu quisque, interdum tellus sem sed quaerat aliquam elementum. Cursus ante at enim fringilla aliquam, nec eros vestibulum vehicula amet praesent, quis sed vivamus libero cursus et ut, molestie dis rhoncus tellus turpis temporibus non.\n" +
                        "\n" +
                        "Lorem vivamus eget rutrum blandit ipsum rhoncus, eros cum consectetuer quis tempor nunc aliquam, pellentesque nulla vestibulum etiam suspendisse pellentesque phasellus, fermentum nunc vitae duis pede dui sapien. Amet tempus leo rhoncus in ac nisl, sed sed tristique auctor nullam et, ut curabitur wisi mauris libero augue suscipit, eget metus mus sit maecenas ultricies nec, et erat posuere blandit vel pede accumsan. Eu habitasse proin et urna justo, erat eu turpis accumsan viverra pede, in arcu luctus nunc laoreet orci. A scelerisque faucibus suspendisse etiam mauris orci, gravida augue tristique pulvinar magna in, integer vestibulum tellus est eros auctor quis, eros a lectus ac posuere nisl, elit nostra sapien purus convallis donec. Elementum ut magnis tellus non lectus, est litora metus wisi scelerisque integer, sodales erat turpis tincidunt amet pede. Facilisi eleifend vehicula wisi urna praesent lacus, ac dis nascetur interdum quam lacus id, feugiat aliquam semper nulla amet orci. Elit sed volutpat ridiculus non lobortis, tellus et placerat accumsan nec adipiscing sed, neque dignissim consectetuer in dui vivamus adipiscing. Nisl eu mauris eu mi wisi mauris, sed aliquam cursus nunc mus lacus etiam, aliquam tristique ligula neque posuere nulla est, massa amet ornare adipiscing quisque placerat. Congue minim ut morbi id vestibulum, risus dictum convallis lorem morbi wisi lacus, eget eget sed phasellus ut lectus. Pellentesque velit magna magna arcu at, fermentum id arcu vehicula laoreet felis, ex egestas egestas in neque donec amet, vivamus ut quam orci tellus suscipit. Adipiscing lorem mi lacus elit sit aliquam, sollicitudin donec ut elit eget vehicula, soluta libero enim adipiscing nec rhoncus ut, donec nam tincidunt porttitor in ipsum.\n" +
                        "\n" +
                        "Id sodales neque nec tempor nonummy, quis egestas sociosqu risus sit vivamus, eu ut pellentesque tortor auctor ut. Tempor elit velit nec at varius sed, sed laoreet enim vestibulum fusce mollis, dolor quisque nullam molestie donec elementum, pede ullamcorper ultricies at arcu bibendum, at eu etiam phasellus vel rhoncus orci. Egestas phasellus blandit nonummy dapibus aenean, viverra urna enim id interdum nunc quam, sit nulla in suscipit magna blandit, mauris nec et donec ullamcorper convallis fusce, etiam et justo donec posuere auctor auctor. Velit justo aenean aenean aptent dui, ut interdum in ipsum lorem ullamcorper tellus, dictum doloribus tincidunt libero leo ut, nulla luctus ac pellentesque massa erat. Augue wisi quam dolor velit sagittis, sit rutrum mattis facilisis enim leo quis, dictum eget diam orci wisi mattis etiam, sed a ut in mi nec id. Dictumst facilisi scelerisque interdum in nunc felis, mattis vitae vitae habitasse quia convallis, ipsum nulla nunc odio etiam donec, vivamus fusce fusce lorem ad sit, porttitor fringilla nisl nunc lectus eros. Pharetra penatibus dignissim lacus a amet felis, vestibulum lacus convallis repudiandae suspendisse nulla, donec sociosqu pulvinar faucibus nec sem gravida, quis non pellentesque venenatis phasellus neque nec. Faucibus platea nulla odio vulputate proin, bibendum tempus erat hac duis blandit, magnis non neque integer sit donec nascetur, morbi vivamus fames sed metus adipiscing mi. Nam a nulla nunc congue turpis cursus, libero cubilia amet facilisis mauris eleifend sollicitudin, laoreet quis pellentesque sit ullamcorper tempus morbi, at metus ullamcorper amet in maecenas, arcu quis vehicula in sem dui occaecat. Tristique at tortor consectetuer a porttitor, sociis wisi dui vulputate turpis fusce, donec volutpat sodales sit orci id augue.\n" +
                        "\n" +
                        "Ante lorem orci nunc ultricies vestibulum nulla, turpis sed feugiat ac placerat justo, venenatis ac nec pretium et vitae eget. Eget deserunt et morbi dolor fermentum, eros sit nulla luctus quos imperdiet, quam dui ligula ac nam convallis sed, eu quis donec nibh at massa sociosqu. Eu aliquam mauris dolor nunc vel egestas, varius aptent mauris maecenas lorem proin, proin vehicula erat vel magnis vivamus lacus. Pretium id donec maecenas donec est praesent, velit mauris fringilla eu curabitur ut, tempus mollis in eros nec orci curae, donec ultricies porttitor elit imperdiet eu, arcu nunc mauris penatibus neque quam. Tempus libero libero rutrum id et, nulla diam pellentesque quia egestas phasellus diam, duis et morbi sit per ipsum imperdiet, ante consectetuer pellentesque id eget sapien. Id pharetra non pede purus sit maecenas, magnis maecenas porta neque vulputate ultrices mattis, risus sociis interdum eleifend mi amet, quis risus lacinia a vitae massa dictumst. Praesent proin sem laoreet ultricies eu sem, pharetra viverra nisl magna nulla facilisis odit, ac auctor mauris molestie sodales pulvinar tortor, a dictum nulla mauris eget cum maecenas, sem vel mauris dignissim aliquet leo aliquam. Gravida ligula sed cras aliquam ultricies, consequat vitae curabitur possimus lacus elit et, non ligula condimentum est vestibulum egestas, in vehicula ligula pellentesque nulla sapien vivamus. Sapien sed lobortis habitasse pretium nec, eget condimentum eu praesent convallis sed, tincidunt vel ac nascetur ante nulla faucibus, aliquam justo velit suscipit vestibulum vestibulum turpis.\n" +
                        "\n" +
                        "In elementum maecenas exercitation quam mauris, justo aliquet suscipit dui lacinia lectus felis, metus libero rutrum sodales nullam ullamcorper. A aliquam nec nulla a mauris in, iaculis in vel wisi eget eu, rhoncus fusce purus scelerisque lorem vel sed, suscipit luctus ipsum suscipit mi eleifend sem, ac sit malesuada quam id felis scelerisque. Consectetuer mauris nulla ullamcorper egestas natoque fermentum, sit vehicula suspendisse tellus suscipit condimentum, vivamus enim aliquam arcu arcu nunc, malesuada quam enim lorem bibendum ullamcorper, mauris in metus sodales felis fermentum cras. Arcu et mauris adipiscing veniam arcu, donec vitae ut vel nunc amet diam, nonummy tellus egestas libero quis at, adipiscing lacus aliquam arcu cras felis, duis vestibulum semper elementum sed dapibus. Nibh sem risus vulputate nunc bibendum, lectus sunt integer eget sit mus, quisque id donec eu felis non facilisi, sodales ut torquent amet amet venenatis. At sint hendrerit vel donec vestibulum, nisl tincidunt vestibulum facilisis curabitur imperdiet proin, est luctus id nec vitae volutpat, bibendum a ultricies egestas do orci ipsum. Ut dictum et potenti venenatis vitae tempus, pulvinar massa eu varius commodo nec urna, nam adipiscing duis nec amet tellus et, sem phasellus pulvinar velit deserunt neque. Et sociosqu mauris nec amet lorem, lacinia nam quis odio fringilla lacus, sed taciti in cras mauris velit, risus faucibus ipsum vivamus iaculis et quisque. Nulla dolor sapien phasellus nec orci at, urna vitae ac nec vel quis, urna turpis in nunc fermentum neque, nulla dignissim tincidunt vel volutpat pretium purus. Et in a tellus at suspendisse, quisque vitae bibendum semper elit pharetra, sit suscipit urna aptent amet sit bibendum, sed convallis eros leo non at est, malesuada pellentesque felis orci nec id.\n" +
                        "\n" +
                        "Pede ac ante phasellus in tempor, arcu egestas sem feugiat dui nec, purus volutpat elementum ornare egestas ipsum, scelerisque ante adipisci nulla ut in, sed est mollis faucibus ac enim felis. Magnis id eget elementum elit risus, tempus in sem massa cras mi, a felis ornare nunc vestibulum porta. Turpis scelerisque mi pharetra metus nunc quisque, commodo nulla mattis faucibus wisi curae mi, metus lorem nunc mauris ut orci suspendisse, nisl sit integer cursus scelerisque accumsan, porttitor lorem amet wisi eros senectus. Temporibus elit vestibulum sed et non, leo curabitur tempor nascetur ut nec, quam risus mauris urna amet commodo, sapien venenatis id vestibulum pharetra aenean. In vitae ut nec egestas nam fusce, sollicitudin platea luctus turpis hendrerit viverra, arcu aliquam mauris tempus sapien congue ac. Purus tortor turpis aliquet leo tortor quisque, eu nonummy sed lacus integer nunc, nascetur metus nec leo congue in, faucibus tempor rhoncus urna tincidunt leo, nec tortor ullamcorper ipsum nam gravida in. Aenean aenean fringilla sed vehicula nec, vestibulum rhoncus elit malesuada ligula suspendisse imperdiet, inceptos eget non inceptos vestibulum dui, molestie mi elit vestibulum nibh ornare, hendrerit a praesent vestibulum praesent lobortis. Ante neque mollis fusce non consequat wisi, in a venenatis etiam gravida maecenas aliquet, et et id sed ullamcorper nunc eget, est diam at lobortis quisque integer, urna phasellus in sodales ut orci. Maecenas ultricies purus nulla justo aenean odio, in augue mi est ut mattis, faucibus ac leo nec eget consequat, eget cubilia ipsum voluptatem rutrum ligula. Vestibulum ornare auctor sed eget felis gravida, pellentesque tortor cras pretium dolor ligula, id hymenaeos justo fusce eget vitae adipiscing, magna praesent a sed felis vestibulum nam, faucibus justo imperdiet ipsum hac odio urna. Posuere ut sit donec rutrum id vel, est a eget ante vel vestibulum elementum, magna consectetuer orci sit nunc aliquam.\n" +
                        "\n" +
                        "Molestias lectus et pellentesque ac ipsa, in erat porttitor quam massa aenean sed, massa senectus venenatis malesuada semper orci. Pellentesque accumsan mi suscipit turpis suscipit et, semper laoreet vivamus leo enim ante ut, in pellentesque et massa sed luctus mattis, vivamus mauris lacus enim a velit. Ullamcorper nec vitae mi feugiat dolor, molestie vitae eget tortor eleifend dolor, sed augue dolor felis mauris eget, magna ante magna cursus semper tincidunt aliquam. Integer magna bibendum augue eros quam, non vel malesuada neque sapien libero accumsan, convallis cursus justo vestibulum amet aliquam. Ut aliquet pharetra in vestibulum eros, donec mi tortor quam morbi magna a, rhoncus enim odio cras eu suspendisse, leo risus et tempor rutrum ipsum. Sollicitudin sed nulla nunc velit id, donec quam lectus feugiat purus sed tempus, nec placerat rutrum congue parturient posuere montes, blandit diam primis viverra molestie orci ac. Mauris ornare netus semper penatibus integer congue, malesuada rhoncus felis nam tincidunt suspendisse, arcu odio sit donec id laoreet, tincidunt in dictumst eu vivamus nam, amet enim condimentum a interdum sociis. Cras montes turpis ornare pariatur ligula, enim metus risus mi nec luctus, pulvinar eu porttitor sem massa et elementum, tincidunt sollicitudin lectus cumque non ullamcorper volutpat. Vel est ullamcorper eget sint pellentesque nullam, neque nascetur quam imperdiet non nec pellentesque, porttitor in in nonummy sapien pede, id felis vitae lacus lobortis diam. Massa morbi aliquam eu neque et, in quam tellus eu lorem morbi risus, turpis vestibulum aliquam id ligula dapibus, ipsum dictumst consectetuer urna maxime blandit sed. Mollis euismod lacus luctus curabitur eleifend, sed consectetur eget aliquam urna porta, amet mi praesent dui duis odio in, sapien etiam odio rutrum dapibus eu. Elementum suspendisse eget morbi netus fames, dui cum in rhoncus nullam et tortor, tellus urna wisi mi blandit vulputate, tortor mauris massa non vitae cras, imperdiet cum aliquam in eget elit sed.\n" +
                        "\n" +
                        "Ultricies suspendisse iaculis tempor fermentum porta proin, sed sed aenean quis ad nam, vulputate ac ac malesuada nostra nulla consectetuer, tincidunt posuere mollis sed tincidunt nulla commodo, platea scelerisque lorem ultricies dapibus justo. Odio diam integer senectus eu nec, dui condimentum et sodales ac ultrices, nec quam egestas dictum cras pede. Id nunc erat aliquam fermentum nunc, enim leo tempor felis vehicula neque proin, magna proin mi sed quam pariatur ac. In ac donec libero dolor ante, iaculis morbi dolor ornare libero eleifend, vivamus massa tristique nibh mauris lorem, vulputate in interdum accumsan nullam porttitor amet, eu quam eros maecenas mauris ipsum enim. Nullam justo ipsum ullamcorper lorem nulla, nisl mus convallis vehicula est odio libero, nulla at quis convallis adipiscing montes metus, vel pharetra pede tincidunt risus etiam massa, leo eget aenean dui morbi etiam maecenas. Lacus posuere sed sit donec nec imperdiet, id vel vel fusce vitae id lacinia, rhoncus potenti semper at elit parturient, blandit penatibus lectus felis sint nec. Mauris arcu massa felis tortor rutrum, elit tempor adipiscing a accusantium auctor, mi arcu lectus id nam lacus, ligula erat per vehicula wisi curabitur ante. In lacinia aliquet sit dolor wisi, class molestie sodales eleifend et urna, facilisis ante aliquam sed donec accumsan, ante eget congue ac orci lacus quis, lorem sapien in nulla praesent velit. Donec tincidunt elit non lectus sodales, phasellus risus tempor molestie ipsum a egestas, in elementum et erat malesuada nisl ac, amet sodales donec sed eget leo. Nisl vulputate elit per sed imperdiet, a ut sollicitudin venenatis est odio euismod, nunc sit sit quis velit augue erat, arcu magna scelerisque suspendisse erat et.\n" +
                        "\n" +
                        "Ac et augue dui accumsan felis, tortor urna velit lacus volutpat aliquam, amet convallis leo auctor tristique nec sapien. Cras elit vehicula donec posuere cupiditate, arcu interdum neque netus euismod elit vivamus, vel enim quam diam id maecenas, aliquam porttitor et vestibulum faucibus nec wisi. Fusce aenean dui euismod nulla nulla, vestibulum phasellus sed pellentesque donec dignissim, eleifend id fusce lectus orci nullam, in mi eget faucibus facilisis bibendum blandit, blandit aenean lectus elit maecenas pulvinar dignissim. Volutpat quisque nibh auctor quia ullamcorper morbi, libero turpis integer enim magna et, bibendum ante ut wisi viverra maecenas, etiam eu eu sapien fusce nunc morbi. Etiam duis laoreet mauris hendrerit mi velit, duis nulla eu quam commodo turpis, wisi aliquet lectus non massa pulvinar, erat eros porta in scelerisque et pulvinar. Urna hendrerit sit id urna sagittis, phasellus nunc ultrices ipsum urna aliquam, vestibulum et condimentum cras ligula ultricies, lacus amet eros lorem consequat amet urna, et tellus laoreet dictum sit sed phasellus. Fusce posuere torquent diam adipiscing interdum mauris, integer adipiscing quam et arcu vel, vestibulum id vitae accumsan urna ipsum sollicitudin, fringilla lectus nec ultricies suspendisse donec, vero at tellus elit suspendisse nam. Curabitur et phasellus mus lectus praesent purus, vivamus reprehenderit eget luctus elit nonummy, wisi cras sit ut ipsum per augue. Viverra luctus praesent amet ipsum in, ullamcorper lobortis ipsum dolor a lobortis ridiculus, libero ac vehicula dapibus arcu interdum risus. Et nec augue suspendisse nonummy non accumsan, magna amet eget vitae porta ullamcorper platea, maecenas ipsum viverra consequat quis wisi, cursus velit blandit aliquet est nec dignissim, lacus sed nonummy in fermentum aliquam diam. Mauris iaculis turpis volutpat amet elit, eleifend a iaculis et vitae erat ac, pretium turpis vehicula id eget semper sociosqu, quam ac felis diam justo in, amet nec sed sagittis in quis. Risus metus quis augue ipsum vivamus blandit, sollicitudin viverra euismod sollicitudin ornare aliquet, eget turpis maxime assumenda suspendisse nunc.\n" +
                        "\n" +
                        "Do fermentum erat ipsum placerat pretium luctus, at cras purus justo mi fermentum, nec pede tincidunt vestibulum morbi convallis. A fames diam in urna quod cursus, cras dolor pretium odio laoreet morbi, in amet aenean lorem aliquam dapibus dui. Ornare turpis mauris in diam sed aliquet, tincidunt pellentesque arcu nec sodales a vestibulum, pellentesque nulla elit pede turpis magna. Donec orci vel aliquam euismod ut ornare, donec eget ut fusce in donec, orci ut felis condimentum cras commodo urna, nullam potenti id montes praesent imperdiet odio. Mollit hac magna eget ut quam nec, sed ut odio feugiat quisque nec, non posuere vel et in eros viverra, pede purus wisi ligula felis tristique nulla. Wisi et scelerisque placerat nec quo, laoreet massa nullam dignissim neque amet, vitae non eget tincidunt tortor vitae vestibulum, nunc vitae ante sit turpis donec reprehenderit. Ac vestibulum pellentesque neque integer sed semper, lobortis quam at mi elementum lobortis hac, sodales urna est wisi vivamus ultricies, id erat senectus vivamus erat elit libero, turpis non sed sed tortor ac blandit. Tristique wisi sequi vel nulla orci, gravida turpis fringilla lacus eros mi quis, dapibus enim cras sed duis duis. Amet potenti sed lorem sed praesent, velit aute adipiscing duis lectus aperiam, ante condimentum rerum vestibulum quam lobortis libero. Massa at mauris ut praesent ligula vestibulum, sollicitudin varius ornare nulla erat fames, ut condimentum sapien suscipit dictum eros.\n" +
                        "\n" +
                        "Pulvinar ante mauris congue et hac quis, sapien adipiscing eros enim cras urna, et sapien fringilla porttitor nam luctus. Quis imperdiet nunc pellentesque rhoncus aliquet, ut aliquet taciti nulla est ac nibh, at volutpat vel parturient velit auctor, et pellentesque sagittis consequat at ligula eget. Sem fusce odio rhoncus tincidunt aliquet cupidatat, neque pellentesque vestibulum quam interdum integer euismod, quis morbi ultricies justo justo velit rutrum, non nibh eget enim nonummy tortor, molestias sed ut consectetuer quam vestibulum. Egestas turpis pulvinar fusce molestie montes, consectetuer sem vel nibh rutrum exercitation, ligula scelerisque aenean orci malesuada maecenas, lorem quam varius accumsan distinctio et vivamus. Nisl nulla amet vestibulum nisl malesuada aliquam, quam vestibulum ipsum id quis pellentesque, interdum cras ante lectus praesentium luctus mi, ornare integer nullam curabitur similique fringilla. Ut ipsum libero nec maecenas duis, ut nostra luctus pulvinar elit nulla pellentesque, egestas praesent duis odio montes a, suscipit lorem diamlorem curae nulla in. Vel fusce vel metus ut fusce dolores, ac parturient mauris egestas pellentesque nec, aliquet quis molestias fusce sed non, ac nulla interdum augue erat ante. Vel mauris rutrum turpis leo lectus nulla, in at magna quam magna ligula, pellentesque ac elit duis pellentesque porttitor aliquam, aliquam etiam mattis morbi arcu vivamus. Ut in vel eu turpis tristique ac, turpis nulla a taciti pulvinar vitae, nunc elit sed imperdiet vitae ultricies in, ac cras ipsum est consequat sollicitudin quis, est diam fermentum in nunc netus. A mattis ac semper imperdiet semper pede, nunc vitae a ultricies aliquam penatibus, eget a dictum tristique ante torquent, malesuada sociis aliquam nibh nulla mattis etiam. Amet vestibulum est suspendisse etiam elit, integer sed in lectus urna in, porta nostra cras congue feugiat quis.\n" +
                        "\n" +
                        "Libero sociosqu non wisi erat vel magna, odio proin ut id id nibh, dolor aenean in fermentum ipsum maecenas, penatibus et elit sed at id accumsan. Diam nec diam elit eu tortor sodales, eros diam lacinia taciti elit ipsum sit, id a pede interdum malesuada et, duis maecenas et ea aliquam conubia, eros tincidunt faucibus donec fermentum consequat. Blandit corporis quis ullamcorper ultrices vulputate ipsum, molestie aliquet maecenas neque dui ut convallis, justo dui morbi nulla vestibulum id, tortor ac sem sollicitudin erat tincidunt. Sed nulla quisque id pharetra amet fusce, duis libero ac exercitation lacus ultrices, vivamus dolor tempus hac vestibulum massa libero. Adipiscing sed pede sit volutpat vitae, lacus maecenas orci egestas justo elit, proin fringilla amet laoreet diam lacus velit, potenti sed nec facilisis erat pede ante, nulla vivamus in elit metus molestie. Amet sed elit rhoncus nunc pede, inceptos vel aenean habitant scelerisque faucibus eros, mi duis ullamcorper curabitur faucibus at, ante vel sed fugiat habitant omnis. Suspendisse amet in turpis parturient ridiculus, praesent quisque ac nostra mi vestibulum, egestas neque ut duis sociosqu porta leo. Maecenas ullamcorper justo leo elementum mi, metus vestibulum nonummy posuere quam nonummy, tempor interdum vitae mollis erat quis odio, amet ac vestibulum eleifend ultricies lobortis scelerisque, urna ante nec tincidunt eu morbi. Id cras sed vestibulum pretium donec nulla, dolor lobortis eget duis porro id sed, iaculis integer fringilla imperdiet risus urna, ipsum placerat nunc egestas venenatis massa pellentesque. Vestibulum in ac tempora est nonummy, habitasse erat aenean justo feugiat id semper, vitae imperdiet tincidunt ligula nunc luctus venenatis, est platea mauris quam nibh orci.\n" +
                        "\n" +
                        "Donec sed aliquam at euismod suscipit, ultrices congue augue sodales sagittis varius, wisi porttitor mauris pellentesque a rutrum faucibus. Wisi sodales aliquet morbi pretium ipsum quisque, platea nunc pede consequat lectus commodo, in mauris purus sapien commodo nam et, quis dignissim dolor explicabo nonummy fringilla semper. Aenean et morbi eget mattis dolor hendrerit, congue commodo natoque in et luctus curabitur, sed integer in fermentum nibh justo diam. Risus cras tristique et justo commodo, blandit iaculis accumsan in eu metus magna, ac erat felis lacus dui vehicula, aliquam elit rutrum at praesent nunc. Laoreet vel commodo risus commodo nonummy, nullam tempus neque porttitor libero convallis, metus cras justo etiam sapien condimentum. In litora sed lectus eros ut, imperdiet fusce primis aenean a quam, tortor interdum in tortor vitae mattis iaculis, at scelerisque nec etiam sed vitae, sem suspendisse etiam metus massa maecenas. Elit amet eu sociis vitae eros, quod conubia placerat veniam platea vel in, porta placerat amet purus orci torquent, sed nec venenatis libero rutrum ac, dignissim massa quisque curabitur integer eu feugiat. Quo placerat ut leo fringilla augue cursus, ipsum ut luctus non vel dui nec, eros turpis mattis semper sem nulla, voluptatum vestibulum quam aliquam amet amet. Ut laoreet magna risus massa urna nascetur, curabitur lorem eu et pede leo, aliquam varius habitasse dolor sed neque nonummy, ut aliquet consectetuer mattis vestibulum sapien. Cras expedita lectus viverra auctor integer, ipsum in posuere etiam cras orci leo, condimentum blandit libero aliquam felis tellus.\n" +
                        "\n" +
                        "A dignissim taciti leo morbi tincidunt, amet nibh ut exercitation libero convallis, enim odio facilisis etiam dictum et sollicitudin, ornare blandit luctus neque ipsum in cursus. Aliquam vel tempus molestie tincidunt parturient nec, neque donec rutrum elit ultrices suscipit, mi bibendum nunc praesent nam vitae pharetra, class justo est platea suspendisse blandit sed, justo duis hendrerit volutpat libero mauris adipiscing. Ligula sed sed sed mi at, potenti id ut tincidunt integer molestie cras, officia accumsan nunc neque accumsan a gravida, sit turpis turpis tellus aliquam mattis sit, sed ligula diam sed morbi vehicula. Volutpat vitae eu quis quis condimentum, nec risus convallis vitae nibh orci ipsum, facilisis nesciunt quis libero do ac, donec sed eros eget sed pede, volutpat lobortis eu ipsum tellus risus. Dolor metus parturient arcu adipiscing molestie, duis feugiat quia quisque cras netus, nunc aliquet nonummy lobortis euismod posuere, cubilia posuere orci eget nisl fringilla vivamus. Rhoncus leo imperdiet hac facilisis sed, lacus id condimentum ipsum felis est, egestas a pretium a ligula lorem. Auctor quis nec justo fermentum tempor, venenatis ipsum sapien lectus orci vivamus, porttitor libero nulla ut ut ac, ut nisi lacinia vitae ornare urna hac. Nisl in leo est quisque dolor curabitur, lectus maecenas rutrum netus nibh a, nulla rhoncus libero purus quis pede arcu, nullam dis in odio sit non aliquam. Posuere cras curabitur consequat curabitur elit, augue euismod et aliquam neque vivamus, felis velit per turpis hac felis, ante aliquam convallis sagittis proin pellentesque, nulla eos enim dapibus nulla posuere.\n" +
                        "\n" +
                        "Suspendisse laoreet ante rhoncus erat tempor mollis, varius interdum felis ullamcorper fringilla suscipit, tincidunt in aenean cum lorem proin, sed arcu erat sollicitudin proin nullam, sodales elementum semper donec facilisi purus aenean. Odio felis in pede ultrices nisl, dolor tristique erat vitae vel felis duis, sem ridiculus mauris nam vestibulum lectus, lobortis qui laoreet et elementum euismod, tellus morbi id leo vestibulum volutpat risus. Morbi eu dapibus blandit nec mi, nostra blandit ligula fringilla phasellus sociis fringilla, volutpat ac vivamus blandit ullamcorper in, leo ligula mattis pulvinar neque commodo. Magni sit bibendum bibendum lectus per, tincidunt ante et laoreet eu nunc, etiam modi nibh nulla in metus, ullamcorper sed leo vestibulum diam in, at dolor tellus magna orci pede. Sem sed nec a scelerisque aliquam, orci justo nisl risus egestas fusce erat, neque elit lorem tristique mauris consequat commodo. Habitant erat magna gravida volutpat ornare, metus vulputate ratione lorem duis in ac, nunc massa ornare eu cursus aliquet, aliquet leo consequat a nisl wisi. Morbi nullam nisl semper rutrum vestibulum dui, proin a eget commodo suspendisse ultricies, libero aenean facilisis odio at sed, arcu nibh fermentum eros elit curabitur. Vel justo curabitur turpis tortor mollis congue, neque neque ipsum tempus posuere vulputate imperdiet, metus purus dictum aliquam eiusmod accumsan at, netus ac quis senectus eros egestas, nullam consectetuer illo donec quis a. Quia ut orci eros imperdiet molestie sodales, a sit pede lobortis phasellus suspendisse, in vel semper proin pede lacinia, libero lorem neque pellentesque in malesuada dapibus, class tortor suspendisse at suscipit nullam nec.");
                foo.setField3(System.currentTimeMillis());
                producer.send(gson.toJson(foo));
                i++;
            }
            long duration = new Date().getTime() - startTime;
            System.out.println("Duration " + duration);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

/*
100,000
Nov 26, 2019 3:23:24 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [json_topic] [standalone-2-98] Pending messages: 1 --- Publish throughput: 568.05 msg/s --- 58.77 Mbit/s --- Latency: med: 1.630 ms - 95pct: 2.011 ms - 99pct: 2.444 ms - 99.9pct: 5.944 ms - max: 131.721 ms --- Ack received rate: 568.04 ack/s --- Failed messages: 0
Nov 26, 2019 3:24:24 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [json_topic] [standalone-2-98] Pending messages: 1 --- Publish throughput: 583.54 msg/s --- 60.37 Mbit/s --- Latency: med: 1.623 ms - 95pct: 1.912 ms - 99pct: 2.238 ms - 99.9pct: 2.611 ms - max: 203.378 ms --- Ack received rate: 583.54 ack/s --- Failed messages: 0
Duration 176703
Larger message:
INFO: [json_topic] [standalone-2-105] Pending messages: 1 --- Publish throughput: 524.01 msg/s --- 142.94 Mbit/s --- Latency: med: 1.703 ms - 95pct: 2.101 ms - 99pct: 2.360 ms - 99.9pct: 3.208 ms - max: 455.856 ms --- Ack received rate: 523.99 ack/s --- Failed messages: 0
Nov 26, 2019 4:53:06 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [json_topic] [standalone-2-105] Pending messages: 1 --- Publish throughput: 543.28 msg/s --- 148.20 Mbit/s --- Latency: med: 1.672 ms - 95pct: 1.881 ms - 99pct: 2.163 ms - 99.9pct: 2.964 ms - max: 377.684 ms --- Ack received rate: 543.28 ack/s --- Failed messages: 0
Nov 26, 2019 4:54:06 PM org.apache.pulsar.client.impl.ProducerStatsRecorderImpl lambda$init$0
INFO: [json_topic] [standalone-2-105] Pending messages: 1 --- Publish throughput: 542.22 msg/s --- 147.91 Mbit/s --- Latency: med: 1.670 ms - 95pct: 1.888 ms - 99pct: 2.235 ms - 99.9pct: 3.184 ms - max: 523.009 ms --- Ack received rate: 542.22 ack/s --- Failed messages: 0
Duration 186056

Increased by 9,353 ms
 */