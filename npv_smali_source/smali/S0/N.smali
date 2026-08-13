.class public final LS0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/g0;


# instance fields
.field private final b:C


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(C)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-char p1, p0, LS0/N;->b:C

    return-void
.end method

.method public synthetic constructor <init>(CILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x2022

    :cond_0
    invoke-direct {p0, p1}, LS0/N;-><init>(C)V

    return-void
.end method


# virtual methods
.method public a(LM0/d;)LS0/e0;
    .locals 8

    new-instance v0, LS0/e0;

    new-instance v7, LM0/d;

    iget-char v1, p0, LS0/N;->b:C

    invoke-static {v1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {v1, p1}, LS8/r;->N(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LM0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILy7/k;)V

    sget-object p1, LS0/L;->a:LS0/L$a;

    invoke-virtual {p1}, LS0/L$a;->a()LS0/L;

    move-result-object p1

    invoke-direct {v0, v7, p1}, LS0/e0;-><init>(LM0/d;LS0/L;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LS0/N;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-char v1, p0, LS0/N;->b:C

    check-cast p1, LS0/N;

    iget-char p1, p1, LS0/N;->b:C

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-char v0, p0, LS0/N;->b:C

    return v0
.end method
