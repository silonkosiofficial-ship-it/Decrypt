.class public final Lo0/L1$c;
.super Lo0/L1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo0/L1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Ln0/k;

.field private final b:Lo0/Q1;


# direct methods
.method public constructor <init>(Ln0/k;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo0/L1;-><init>(Ly7/k;)V

    iput-object p1, p0, Lo0/L1$c;->a:Ln0/k;

    invoke-static {p1}, Ln0/l;->e(Ln0/k;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v1, p1, v0, v2, v0}, Lo0/P1;->c(Lo0/Q1;Ln0/k;Lo0/Q1$b;ILjava/lang/Object;)V

    move-object v0, v1

    :cond_0
    iput-object v0, p0, Lo0/L1$c;->b:Lo0/Q1;

    return-void
.end method


# virtual methods
.method public a()Ln0/i;
    .locals 1

    iget-object v0, p0, Lo0/L1$c;->a:Ln0/k;

    invoke-static {v0}, Ln0/l;->d(Ln0/k;)Ln0/i;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ln0/k;
    .locals 1

    iget-object v0, p0, Lo0/L1$c;->a:Ln0/k;

    return-object v0
.end method

.method public final c()Lo0/Q1;
    .locals 1

    iget-object v0, p0, Lo0/L1$c;->b:Lo0/Q1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo0/L1$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lo0/L1$c;->a:Ln0/k;

    check-cast p1, Lo0/L1$c;

    iget-object p1, p1, Lo0/L1$c;->a:Ln0/k;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lo0/L1$c;->a:Ln0/k;

    invoke-virtual {v0}, Ln0/k;->hashCode()I

    move-result v0

    return v0
.end method
