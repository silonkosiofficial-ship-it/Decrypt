.class final LD6/b$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b;->a(Lb7/a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:LD6/b;

.field J:I


# direct methods
.method constructor <init>(LD6/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LD6/b$b;->I:LD6/b;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LD6/b$b;->H:Ljava/lang/Object;

    iget p1, p0, LD6/b$b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LD6/b$b;->J:I

    iget-object p1, p0, LD6/b$b;->I:LD6/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LD6/b;->a(Lb7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
