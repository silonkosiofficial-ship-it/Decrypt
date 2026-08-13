.class public final LQ7/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LQ7/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ7/c$b;

    invoke-direct {v0}, LQ7/c$b;-><init>()V

    sput-object v0, LQ7/c$b;->a:LQ7/c$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LO7/e;LO7/Z;)Z
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "functionDescriptor"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LP7/a;->k()LP7/g;

    move-result-object p1

    invoke-static {}, LQ7/d;->a()Ln8/c;

    move-result-object p2

    invoke-interface {p1, p2}, LP7/g;->H(Ln8/c;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
