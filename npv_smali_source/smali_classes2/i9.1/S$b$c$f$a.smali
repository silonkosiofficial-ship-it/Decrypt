.class public final Li9/S$b$c$f$a;
.super Li9/S$b$c$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li9/S$b$c$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:I

.field private final c:C


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li9/S$b$c$f;-><init>(Ly7/k;)V

    iput p1, p0, Li9/S$b$c$f$a;->b:I

    const/16 p1, 0x53

    iput-char p1, p0, Li9/S$b$c$f$a;->c:C

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Li9/S$b$c$f$a;->b:I

    return v0
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Li9/S$b$c$f$a;->c:C

    return v0
.end method

.method public c(Li9/o$d;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li9/S$b$c$f$a;->a()I

    move-result v0

    invoke-interface {p1, v0}, Li9/o$d;->x(I)V

    return-void
.end method
