.class public final Li9/W;
.super Li9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/W$a;,
        Li9/W$b;
    }
.end annotation


# static fields
.field public static final b:Li9/W$b;


# instance fields
.field private final a:Lk9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li9/W$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/W$b;-><init>(Ly7/k;)V

    sput-object v0, Li9/W;->b:Li9/W$b;

    return-void
.end method

.method public constructor <init>(Lk9/f;)V
    .locals 1

    const-string v0, "actualFormat"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/a;-><init>(Ly7/k;)V

    iput-object p1, p0, Li9/W;->a:Lk9/f;

    return-void
.end method


# virtual methods
.method public c()Lk9/f;
    .locals 1

    iget-object v0, p0, Li9/W;->a:Lk9/f;

    return-object v0
.end method

.method public bridge synthetic d()Lm9/c;
    .locals 1

    invoke-virtual {p0}, Li9/W;->g()Li9/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Lm9/c;
    .locals 0

    check-cast p1, Lh9/r;

    invoke-virtual {p0, p1}, Li9/W;->h(Lh9/r;)Li9/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lm9/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/y;

    invoke-virtual {p0, p1}, Li9/W;->i(Li9/y;)Lh9/r;

    move-result-object p1

    return-object p1
.end method

.method public g()Li9/y;
    .locals 1

    invoke-static {}, Li9/X;->a()Li9/y;

    move-result-object v0

    return-object v0
.end method

.method public h(Lh9/r;)Li9/y;
    .locals 8

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li9/y;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Li9/y;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    invoke-virtual {v0, p1}, Li9/y;->b(Lh9/r;)V

    return-object v0
.end method

.method public i(Li9/y;)Lh9/r;
    .locals 1

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li9/y;->d()Lh9/r;

    move-result-object p1

    return-object p1
.end method
