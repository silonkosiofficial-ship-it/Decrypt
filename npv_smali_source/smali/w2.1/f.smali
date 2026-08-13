.class final Lw2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field private final C:I

.field private final D:I

.field private final E:Ljava/lang/String;

.field private final F:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "from"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw2/f;->C:I

    iput p2, p0, Lw2/f;->D:I

    iput-object p3, p0, Lw2/f;->E:Ljava/lang/String;

    iput-object p4, p0, Lw2/f;->F:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lw2/f;

    invoke-virtual {p0, p1}, Lw2/f;->e(Lw2/f;)I

    move-result p1

    return p1
.end method

.method public e(Lw2/f;)I
    .locals 2

    .prologue
    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lw2/f;->C:I

    iget v1, p1, Lw2/f;->C:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lw2/f;->D:I

    iget p1, p1, Lw2/f;->D:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw2/f;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lw2/f;->C:I

    return v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw2/f;->F:Ljava/lang/String;

    return-object v0
.end method
