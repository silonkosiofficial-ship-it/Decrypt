.class public final Lx/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/p;


# instance fields
.field private a:Lu/B;

.field private final b:Lh0/k;

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu/B;Lh0/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/j;->a:Lu/B;

    iput-object p2, p0, Lx/j;->b:Lh0/k;

    return-void
.end method

.method public synthetic constructor <init>(Lu/B;Lh0/k;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->e()Lh0/k;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lx/j;-><init>(Lu/B;Lh0/k;)V

    return-void
.end method


# virtual methods
.method public b(Lx/w;FLm7/e;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lx/j;->c:I

    iget-object v0, p0, Lx/j;->b:Lh0/k;

    new-instance v1, Lx/j$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lx/j$a;-><init>(FLx/j;Lx/w;Lm7/e;)V

    invoke-static {v0, v1, p3}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lu/B;
    .locals 1

    iget-object v0, p0, Lx/j;->a:Lu/B;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lx/j;->c:I

    return v0
.end method

.method public final e(Lu/B;)V
    .locals 0

    iput-object p1, p0, Lx/j;->a:Lu/B;

    return-void
.end method

.method public final f(I)V
    .locals 0

    iput p1, p0, Lx/j;->c:I

    return-void
.end method
