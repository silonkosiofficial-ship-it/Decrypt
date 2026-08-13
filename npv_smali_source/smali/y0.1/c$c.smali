.class final Ly0/c$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/c;->c(JLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Ly0/c;

.field H:I


# direct methods
.method constructor <init>(Ly0/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Ly0/c$c;->G:Ly0/c;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ly0/c$c;->F:Ljava/lang/Object;

    iget p1, p0, Ly0/c$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly0/c$c;->H:I

    iget-object p1, p0, Ly0/c$c;->G:Ly0/c;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Ly0/c;->c(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
