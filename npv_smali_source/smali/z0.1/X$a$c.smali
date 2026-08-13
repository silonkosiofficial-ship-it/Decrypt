.class final Lz0/X$a$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/X$a;->P0(JLx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lz0/X$a;

.field H:I


# direct methods
.method constructor <init>(Lz0/X$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lz0/X$a$c;->G:Lz0/X$a;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lz0/X$a$c;->F:Ljava/lang/Object;

    iget p1, p0, Lz0/X$a$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz0/X$a$c;->H:I

    iget-object p1, p0, Lz0/X$a$c;->G:Lz0/X$a;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lz0/X$a;->P0(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
