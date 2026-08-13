.class public final Li9/B;
.super Li9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/B$a;,
        Li9/B$b;
    }
.end annotation


# static fields
.field public static final b:Li9/B$b;


# instance fields
.field private final a:Lk9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li9/B$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/B$b;-><init>(Ly7/k;)V

    sput-object v0, Li9/B;->b:Li9/B$b;

    return-void
.end method

.method public constructor <init>(Lk9/f;)V
    .locals 1

    const-string v0, "actualFormat"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/a;-><init>(Ly7/k;)V

    iput-object p1, p0, Li9/B;->a:Lk9/f;

    return-void
.end method


# virtual methods
.method public c()Lk9/f;
    .locals 1

    iget-object v0, p0, Li9/B;->a:Lk9/f;

    return-object v0
.end method

.method public bridge synthetic d()Lm9/c;
    .locals 1

    invoke-virtual {p0}, Li9/B;->g()Li9/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Lm9/c;
    .locals 0

    check-cast p1, Lh9/j;

    invoke-virtual {p0, p1}, Li9/B;->h(Lh9/j;)Li9/w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lm9/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/w;

    invoke-virtual {p0, p1}, Li9/B;->i(Li9/w;)Lh9/j;

    move-result-object p1

    return-object p1
.end method

.method public g()Li9/w;
    .locals 1

    invoke-static {}, Li9/C;->a()Li9/w;

    move-result-object v0

    return-object v0
.end method

.method public h(Lh9/j;)Li9/w;
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li9/w;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Li9/w;-><init>(Li9/v;Li9/x;ILy7/k;)V

    invoke-virtual {v0, p1}, Li9/w;->h(Lh9/j;)V

    return-object v0
.end method

.method public i(Li9/w;)Lh9/j;
    .locals 1

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li9/w;->l()Lh9/j;

    move-result-object p1

    return-object p1
.end method
