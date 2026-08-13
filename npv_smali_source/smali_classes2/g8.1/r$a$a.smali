.class public final Lg8/r$a$a;
.super Lg8/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/r$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lg8/t;

.field private final b:[B


# direct methods
.method public constructor <init>(Lg8/t;[B)V
    .locals 1

    const-string v0, "kotlinJvmBinaryClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lg8/r$a;-><init>(Ly7/k;)V

    iput-object p1, p0, Lg8/r$a$a;->a:Lg8/t;

    iput-object p2, p0, Lg8/r$a$a;->b:[B

    return-void
.end method

.method public synthetic constructor <init>(Lg8/t;[BILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lg8/r$a$a;-><init>(Lg8/t;[B)V

    return-void
.end method


# virtual methods
.method public final b()Lg8/t;
    .locals 1

    iget-object v0, p0, Lg8/r$a$a;->a:Lg8/t;

    return-object v0
.end method
