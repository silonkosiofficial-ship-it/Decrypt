.class final Lj0/b$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj0/b;->b(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lj0/b;

.field J:I


# direct methods
.method constructor <init>(Lj0/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lj0/b$c;->I:Lj0/b;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj0/b$c;->H:Ljava/lang/Object;

    iget p1, p0, Lj0/b$c;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj0/b$c;->J:I

    iget-object p1, p0, Lj0/b$c;->I:Lj0/b;

    invoke-virtual {p1, p0}, Lj0/b;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
