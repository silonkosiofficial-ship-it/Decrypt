.class public final Lu/W$b;
.super Lu/X;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu/W;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu/X;-><init>(Ly7/k;)V

    return-void
.end method


# virtual methods
.method public f(Ljava/lang/Object;I)Lu/W$a;
    .locals 7

    new-instance v6, Lu/W$a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lu/W$a;-><init>(Ljava/lang/Object;Lu/F;IILy7/k;)V

    invoke-virtual {p0}, Lu/X;->c()Lr/C;

    move-result-object p1

    invoke-virtual {p1, p2, v6}, Lr/C;->s(ILjava/lang/Object;)V

    return-object v6
.end method
