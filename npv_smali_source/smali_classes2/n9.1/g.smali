.class public final Ln9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Ln9/g;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln9/g;

    invoke-direct {v0}, Ln9/g;-><init>()V

    sput-object v0, Ln9/g;->a:Ln9/g;

    const-string v0, "kotlinx.datetime.UtcOffset"

    sget-object v1, Lv9/d$i;->a:Lv9/d$i;

    invoke-static {v0, v1}, Lv9/l;->b(Ljava/lang/String;Lv9/d;)Lv9/f;

    move-result-object v0

    sput-object v0, Ln9/g;->b:Lv9/f;

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

    sget-object v0, Ln9/g;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln9/g;->f(Lw9/h;)Lh9/r;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lh9/r;

    invoke-virtual {p0, p1, p2}, Ln9/g;->g(Lw9/j;Lh9/r;)V

    return-void
.end method

.method public f(Lw9/h;)Lh9/r;
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh9/r;->Companion:Lh9/r$a;

    invoke-interface {p1}, Lw9/h;->o()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lh9/r$a;->b(Lh9/r$a;Ljava/lang/CharSequence;Li9/n;ILjava/lang/Object;)Lh9/r;

    move-result-object p1

    return-object p1
.end method

.method public g(Lw9/j;Lh9/r;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lh9/r;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lw9/j;->E(Ljava/lang/String;)V

    return-void
.end method
