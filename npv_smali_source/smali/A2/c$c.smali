.class public final LA2/c$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LA2/c$c;-><init>()V

    return-void
.end method

.method public static final synthetic a(LA2/c$c;)Ljava/lang/reflect/Method;
    .locals 0

    invoke-direct {p0}, LA2/c$c;->c()Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LA2/c$c;)Ljava/lang/reflect/Method;
    .locals 0

    invoke-direct {p0}, LA2/c$c;->d()Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method private final c()Ljava/lang/reflect/Method;
    .locals 1

    invoke-static {}, LA2/c;->g()Li7/n;

    move-result-object v0

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    return-object v0
.end method

.method private final d()Ljava/lang/reflect/Method;
    .locals 1

    invoke-static {}, LA2/c;->i()Li7/n;

    move-result-object v0

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    return-object v0
.end method
