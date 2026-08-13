.class public final Li9/z;
.super Li9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/z$a;,
        Li9/z$b;
    }
.end annotation


# static fields
.field public static final b:Li9/z$b;


# instance fields
.field private final a:Lk9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li9/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/z$b;-><init>(Ly7/k;)V

    sput-object v0, Li9/z;->b:Li9/z$b;

    return-void
.end method

.method public constructor <init>(Lk9/f;)V
    .locals 1

    const-string v0, "actualFormat"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/a;-><init>(Ly7/k;)V

    iput-object p1, p0, Li9/z;->a:Lk9/f;

    return-void
.end method


# virtual methods
.method public c()Lk9/f;
    .locals 1

    iget-object v0, p0, Li9/z;->a:Lk9/f;

    return-object v0
.end method

.method public bridge synthetic d()Lm9/c;
    .locals 1

    invoke-virtual {p0}, Li9/z;->g()Li9/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Lm9/c;
    .locals 0

    check-cast p1, Lh9/h;

    invoke-virtual {p0, p1}, Li9/z;->h(Lh9/h;)Li9/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lm9/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/v;

    invoke-virtual {p0, p1}, Li9/z;->i(Li9/v;)Lh9/h;

    move-result-object p1

    return-object p1
.end method

.method public g()Li9/v;
    .locals 1

    invoke-static {}, Li9/A;->a()Li9/v;

    move-result-object v0

    return-object v0
.end method

.method public h(Lh9/h;)Li9/v;
    .locals 8

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li9/v;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Li9/v;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    invoke-virtual {v0, p1}, Li9/v;->b(Lh9/h;)V

    return-object v0
.end method

.method public i(Li9/v;)Lh9/h;
    .locals 1

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li9/v;->c()Lh9/h;

    move-result-object p1

    return-object p1
.end method
