.class final LF0/l0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/l0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final C:LF0/l0$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/l0$a$a;

    invoke-direct {v0}, LF0/l0$a$a;-><init>()V

    sput-object v0, LF0/l0$a$a;->C:LF0/l0$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LF0/J;LF0/J;)I
    .locals 2

    .prologue
    invoke-virtual {p2}, LF0/J;->L()I

    move-result v0

    invoke-virtual {p1}, LF0/J;->L()I

    move-result v1

    invoke-static {v0, v1}, Ly7/t;->g(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Ly7/t;->g(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, LF0/J;

    invoke-virtual {p0, p1, p2}, LF0/l0$a$a;->a(LF0/J;LF0/J;)I

    move-result p1

    return p1
.end method
