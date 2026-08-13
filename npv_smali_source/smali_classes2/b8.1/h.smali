.class public final Lb8/h;
.super LR7/z;
.source "SourceFile"


# static fields
.field static final synthetic Q:[LF7/k;


# instance fields
.field private final I:Le8/u;

.field private final J:La8/g;

.field private final K:Lm8/e;

.field private final L:LE8/i;

.field private final M:Lb8/d;

.field private final N:LE8/i;

.field private final O:LP7/g;

.field private final P:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, Lb8/h;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "binaryClasses"

    const-string v4, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "partToFacade"

    const-string v4, "getPartToFacade()Ljava/util/HashMap;"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lb8/h;->Q:[LF7/k;

    return-void
.end method

.method public constructor <init>(La8/g;Le8/u;)V
    .locals 8

    .prologue
    const-string v0, "outerContext"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jPackage"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La8/g;->d()LO7/G;

    move-result-object v0

    invoke-interface {p2}, Le8/u;->e()Ln8/c;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LR7/z;-><init>(LO7/G;Ln8/c;)V

    iput-object p2, p0, Lb8/h;->I:Le8/u;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move-object v3, p0

    invoke-static/range {v2 .. v7}, La8/a;->d(La8/g;LO7/g;Le8/z;IILjava/lang/Object;)La8/g;

    move-result-object v0

    iput-object v0, p0, Lb8/h;->J:La8/g;

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->b()Lg8/j;

    move-result-object p1

    invoke-virtual {p1}, Lg8/j;->d()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->g()LB8/l;

    move-result-object p1

    invoke-static {p1}, LP8/c;->a(LB8/l;)Lm8/e;

    move-result-object p1

    iput-object p1, p0, Lb8/h;->K:Lm8/e;

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance v1, Lb8/h$a;

    invoke-direct {v1, p0}, Lb8/h$a;-><init>(Lb8/h;)V

    invoke-interface {p1, v1}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Lb8/h;->L:LE8/i;

    new-instance p1, Lb8/d;

    invoke-direct {p1, v0, p2, p0}, Lb8/d;-><init>(La8/g;Le8/u;Lb8/h;)V

    iput-object p1, p0, Lb8/h;->M:Lb8/d;

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance v1, Lb8/h$c;

    invoke-direct {v1, p0}, Lb8/h$c;-><init>(Lb8/h;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {p1, v1, v2}, LE8/n;->e(Lx7/a;Ljava/lang/Object;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Lb8/h;->N:LE8/i;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->i()LX7/x;

    move-result-object p1

    invoke-virtual {p1}, LX7/x;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LP7/g;->d:LP7/g$a;

    invoke-virtual {p1}, LP7/g$a;->b()LP7/g;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v0, p2}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lb8/h;->O:LP7/g;

    invoke-virtual {v0}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance p2, Lb8/h$b;

    invoke-direct {p2, p0}, Lb8/h$b;-><init>(Lb8/h;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Lb8/h;->P:LE8/i;

    return-void
.end method

.method public static final synthetic O0(Lb8/h;)La8/g;
    .locals 0

    iget-object p0, p0, Lb8/h;->J:La8/g;

    return-object p0
.end method

.method public static final synthetic T0(Lb8/h;)Le8/u;
    .locals 0

    iget-object p0, p0, Lb8/h;->I:Le8/u;

    return-object p0
.end method

.method public static final synthetic U0(Lb8/h;)Lm8/e;
    .locals 0

    iget-object p0, p0, Lb8/h;->K:Lm8/e;

    return-object p0
.end method


# virtual methods
.method public final V0(Le8/g;)LO7/e;
    .locals 1

    const-string v0, "jClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/h;->M:Lb8/d;

    invoke-virtual {v0}, Lb8/d;->j()Lb8/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb8/i;->P(Le8/g;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public final W0()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, Lb8/h;->L:LE8/i;

    sget-object v1, Lb8/h;->Q:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public X0()Lb8/d;
    .locals 1

    iget-object v0, p0, Lb8/h;->M:Lb8/d;

    return-object v0
.end method

.method public final Y0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb8/h;->N:LE8/i;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    iget-object v0, p0, Lb8/h;->O:LP7/g;

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 1

    new-instance v0, Lg8/u;

    invoke-direct {v0, p0}, Lg8/u;-><init>(Lb8/h;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java package fragment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LR7/z;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " of module "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb8/h;->J:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->m()LO7/G;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u()Ly8/h;
    .locals 1

    invoke-virtual {p0}, Lb8/h;->X0()Lb8/d;

    move-result-object v0

    return-object v0
.end method
