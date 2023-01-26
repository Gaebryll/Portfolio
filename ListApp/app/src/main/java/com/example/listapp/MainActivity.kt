package com.example.listapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.listapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val shounen = arrayOf<String>("Attack On Titan", "Death Note", "Dragon Ball Z", "Hunter x Hunter", "Naruto")
    val release = arrayOf<String>("April 7, 2013", "October 5, 2004", "April 26, 1989", "October 2, 2011", "October 3, 2002")
    val image = arrayOf<Int>(R.drawable.aot, R.drawable.deathnote, R.drawable.dragonabll, R.drawable.hunter, R.drawable.naruto)
    val rate = arrayOf<Float>(8.53F, 8.62F, 8.15F, 9.05F, 7.97F)
    val eps = arrayOf<Int>(25, 37, 291, 148, 220)
    val premier = arrayOf<String>("Spring 2013", "Fall 2006", "Spring 1989", "Fall 2011", "Fall 2002")
    val studio = arrayOf<String>("WiT Studio", "Madhouse", "Toei Animation", "Madhouse", "Pierrot")
    val duration = arrayOf<String>("24 minutes", "23 minutes", "24 minutes", "23 minutes", "23 minutes")
    val synopsis = arrayOf<String>(

                                    "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called Titans, " +
                                    "forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is " +
                                    "that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their " +
                                    "survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a " +
                                    "single titan encounter. However, that fragile calm is soon shattered when a colossal Titan manages to breach the supposedly " +
                                    "impregnable outer wall, reigniting the fight for survival against the man-eating abominations.",

                                    "Brutal murders, petty thefts, and senseless violence pollute the human world. In contrast, the realm of death gods is a humdrum, " +
                                    "unchanging gambling den. The ingenious 17-year-old Japanese student Light Yagami and sadistic god of death Ryuk share one belief: " +
                                    "their worlds are rotten.",

                                    "Five years after winning the World Martial Arts tournament, Gokuu is now living a peaceful life with his wife and son. This changes, " +
                                    "however, with the arrival of a mysterious enemy named Raditz who presents himself as Gokuu's long-lost brother. He reveals that Gokuu " +
                                    "is a warrior from the once powerful but now virtually extinct Saiyan race, whose homeworld was completely annihilated. When he was sent " +
                                    "to Earth as a baby, Gokuu's sole purpose was to conquer and destroy the planet; but after suffering amnesia from a head injury, his violent " +
                                    "and savage nature changed, and instead was raised as a kind and well-mannered boy, now fighting to protect others.",

                                    "Hunters devote themselves to accomplishing hazardous tasks, all from traversing the world's uncharted territories to locating rare items and monsters. " +
                                    "Before becoming a Hunter, one must pass the Hunter Examination—a high-risk selection process in which most applicants end up handicapped or worse, deceased." ,

                                    "Moments prior to Naruto Uzumaki's birth, a huge demon known as the Kyuubi, the Nine-Tailed Fox, attacked Konohagakure, the Hidden Leaf Village, " +
                                    "and wreaked havoc. In order to put an end to the Kyuubi's rampage, the leader of the village, the Fourth Hokage, sacrificed his life and sealed the " +
                                    "monstrous beast inside the newborn Naruto."
    )

    val shoujo = arrayOf<String>("Ao Haru Ride", "Fruits Basket", "Kaichou wa Maid-sama!", "Kimi ni Todoke", "Orange")
    val release2 = arrayOf<String>("July 8, 2014", "April 6, 2019", "April 2, 2010", "October 7, 2009", "July 4, 2016")
    val image2 = arrayOf<Int>(R.drawable.aoharuride, R.drawable.fruitsbasket, R.drawable.maidsama, R.drawable.kiminitodoke, R.drawable.orange)
    val rate2 = arrayOf<Float>(7.65F, 8.22F, 8.02F, 8.00F, 7.62F)
    val eps2 = arrayOf<Int>(12, 25, 26, 25, 13)
    val premier2 = arrayOf<String>("Summer 2014", "Spring 2019", "Spring 2010", "Fall 2009", "Summer 2016")
    val studio2 = arrayOf<String>("Production I.G", "TMS Entertainment", "J.C.Staff", "Production I.G", "Telecom Animation Film")
    val duration2 = arrayOf<String>("23 minutes", "23 minutes", "24 minutes", "22 minutes", "24 minutes")
    val synopsis2 = arrayOf<String>(

                                    "While most young girls make an effort to show off their feminine charms, Futaba Yoshioka deliberately behaves like she wants to repel " +
                                    "anyone who might be attracted to her. Ostracized by her female classmates in middle school for being a little too popular with the boys, " +
                                    "she desperately strives to avoid a similar situation in high school by being unnecessarily noisy and graceless.",

                                    "Tooru Honda has always been fascinated by the story of the Chinese Zodiac that her beloved mother told her as a child. However, a sudden " +
                                    "family tragedy changes her life, and subsequent circumstances leave her all alone. Tooru is now forced to live in a tent, but little does " +
                                    "she know that her temporary home resides on the private property of the esteemed Souma family. Stumbling upon their home one day, she encounters " +
                                    "Shigure, an older Souma cousin, and Yuki, the \"prince\" of her school. Tooru explains that she lives nearby, but the Soumas eventually discover " +
                                    "her well-kept secret of being homeless when they see her walking back to her tent one night.",

                                    "Misaki Ayuzawa is a unique phenomenon within Seika High School. In a predominantly male institution, she became the first-ever female student " +
                                    "council president through her honesty and diligence. Ever since Misaki got promoted to the position, she has been working tirelessly to ensure a " +
                                    "better school life for all girls. Despite that, Misaki is very strict with the boys, which has earned her the title \"Demon President.\"",

                                    "Known for her semblance to the Sadako character of The Ring series, Sawako Kuronuma is given the nickname \"Sadako\" and misunderstood to be " +
                                    "frightening and malicious like her fictional counterpart, despite having a timid and sweet nature. Longing to make friends and live a normal life, " +
                                    "Sawako is naturally drawn to the cheerful and friendly Shouta Kazehaya, the most popular boy in her class. From their first meeting, Sawako has admired " +
                                    "Kazehaya's ability to be the center of attention and aspires to be like him.",

                                    "Naho Takamiya's first day of her sophomore year of high school is off to an uneasy start. After waking up late, she receives a strange letter addressed to " +
                                    "her. However, the letter is from herself—10 years in the future! At first, Naho is skeptical of the note; yet, after witnessing several events described to " +
                                    "take place, she realizes the letter really is from her 26-year-old self."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, SecondActivity::class.java)

        binding.listView.isClickable = true
        val myListAdapter = MyListAdapter(this, shounen, release, image,)
        binding.listView.adapter = myListAdapter

        binding.listView.setOnItemClickListener { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val click = MediaPlayer.create(this, R.raw.click)
            val clickerror = MediaPlayer.create(this, R.raw.clickerror)

            click?.start()

            AlertDialog.Builder(this)
                .setIcon(image[position])
                .setTitle("$itemAtPos")
                .setMessage("View more info for \n$itemAtPos?")
                .setPositiveButton("Yes"){ dialog, which ->
                    val shounen = shounen[position]
                    val release = release[position]
                    val image = image[position]
                    val rate = rate[position]
                    val eps = eps[position]
                    val premier = premier[position]
                    val studio = studio[position]
                    val duration = duration[position]
                    val synopsis = synopsis[position]

                    intent.putExtra("list", "listShounen")
                    intent.putExtra("title", shounen)
                    intent.putExtra("date", release)
                    intent.putExtra("image", image)
                    intent.putExtra("rate", rate)
                    intent.putExtra("eps", eps)
                    intent.putExtra("premier", premier)
                    intent.putExtra("studio", studio)
                    intent.putExtra("duration", duration)
                    intent.putExtra("synopsis", synopsis)
                    startActivity(intent)
                }
                .setNegativeButton("Cancel"){ dialog, which ->
                    clickerror?.start()
                    Toast.makeText(this, "Clicked Cancel", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        binding.listView2.isClickable = true
        val myListAdapter2 = MyListAdapter2(this, shoujo, release2, image2)
        binding.listView2.adapter = myListAdapter2

        binding.listView2.setOnItemClickListener { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val click = MediaPlayer.create(this, R.raw.click)
            val clickerror = MediaPlayer.create(this, R.raw.clickerror)

            click?.start()

            AlertDialog.Builder(this)
                .setIcon(image2[position])
                .setTitle("$itemAtPos")
                .setMessage("View more info for \n$itemAtPos?")
                .setPositiveButton("Yes"){ dialog, which ->
                    val shoujo = shoujo[position]
                    val release2 = release2[position]
                    val image2 = image2[position]
                    val rate2 = rate2[position]
                    val eps2 = eps2[position]
                    val premier2 = premier2[position]
                    val studio2 = studio2[position]
                    val duration2 = duration2[position]
                    val synopsis2 = synopsis2[position]

                    intent.putExtra("list", "listShoujo")
                    intent.putExtra("title2", shoujo)
                    intent.putExtra("date2", release2)
                    intent.putExtra("image2", image2)
                    intent.putExtra("rate2", rate2)
                    intent.putExtra("eps2", eps2)
                    intent.putExtra("premier2", premier2)
                    intent.putExtra("studio2", studio2)
                    intent.putExtra("duration2", duration2)
                    intent.putExtra("synopsis2", synopsis2)
                    startActivity(intent)
                }
                .setNegativeButton("Cancel"){ dialog, which ->
                    clickerror?.start()
                    Toast.makeText(this, "Clicked Cancel", Toast.LENGTH_SHORT).show()
                }
                .show()
        }



    }
}