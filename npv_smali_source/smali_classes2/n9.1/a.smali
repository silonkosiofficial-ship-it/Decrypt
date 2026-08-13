.class public final Ln9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Ln9/a;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln9/a;

    invoke-direct {v0}, Ln9/a;-><init>()V

    sput-object v0, Ln9/a;->a:Ln9/a;

    const-string v0, "kotlinx.datetime.FixedOffsetTimeZone"

    sget-object v1, Lv9/d$i;->a:Lv9/d$i;

    invoke-static {v0, v1}, Lv9/l;->b(Ljava/lang/String;Lv9/d;)Lv9/f;

    move-result-object v0

    sput-object v0, Ln9/a;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Ln9/a;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln9/a;->f(Lw9/h;)Lh9/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lh9/e;

    invoke-virtual {p0, p1, p2}, Ln9/a;->g(Lw9/j;Lh9/e;)V

    return-void
.end method

.method public f(Lw9/h;)Lh9/e;
    .locals 3

    .prologue
    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh9/o;->Companion:Lh9/o$a;

    invoke-interface {p1}, Lw9/h;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lh9/o$a;->d(Ljava/lang/String;)Lh9/o;

    move-result-object p1

    instance-of v0, p1, Lh9/e;

    if-eqz v0, :cond_0

    check-cast p1, Lh9/e;

    return-object p1

    :cond_0
    new-instance v0, Lt9/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Timezone identifier \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' does not correspond to a fixed-offset timezone"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g(Lw9/j;Lh9/e;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lh9/o;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void
.end method
