.class final Ly/g$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/g;->h(Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Ly/g;

.field I:I


# direct methods
.method constructor <init>(Ly/g;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Ly/g$a;->H:Ly/g;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ly/g$a;->G:Ljava/lang/Object;

    iget p1, p0, Ly/g$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly/g$a;->I:I

    iget-object p1, p0, Ly/g$a;->H:Ly/g;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, p0}, Ly/g;->c(Ly/g;Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
