.class public final Li9/D;
.super Li9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/D$a;,
        Li9/D$b;
    }
.end annotation


# static fields
.field public static final b:Li9/D$b;


# instance fields
.field private final a:Lk9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li9/D$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li9/D$b;-><init>(Ly7/k;)V

    sput-object v0, Li9/D;->b:Li9/D$b;

    return-void
.end method

.method public constructor <init>(Lk9/f;)V
    .locals 1

    const-string v0, "actualFormat"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/a;-><init>(Ly7/k;)V

    iput-object p1, p0, Li9/D;->a:Lk9/f;

    return-void
.end method


# virtual methods
.method public c()Lk9/f;
    .locals 1

    iget-object v0, p0, Li9/D;->a:Lk9/f;

    return-object v0
.end method

.method public bridge synthetic d()Lm9/c;
    .locals 1

    invoke-virtual {p0}, Li9/D;->g()Li9/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)Lm9/c;
    .locals 0

    check-cast p1, Lh9/l;

    invoke-virtual {p0, p1}, Li9/D;->h(Lh9/l;)Li9/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Lm9/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/x;

    invoke-virtual {p0, p1}, Li9/D;->i(Li9/x;)Lh9/l;

    move-result-object p1

    return-object p1
.end method

.method public g()Li9/x;
    .locals 1

    invoke-static {}, Li9/E;->a()Li9/x;

    move-result-object v0

    return-object v0
.end method

.method public h(Lh9/l;)Li9/x;
    .locals 10

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li9/x;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Li9/x;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    invoke-virtual {v0, p1}, Li9/x;->h(Lh9/l;)V

    return-object v0
.end method

.method public i(Li9/x;)Lh9/l;
    .locals 1

    const-string v0, "intermediate"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li9/x;->k()Lh9/l;

    move-result-object p1

    return-object p1
.end method
