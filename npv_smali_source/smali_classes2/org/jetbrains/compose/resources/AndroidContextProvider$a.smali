.class public final Lorg/jetbrains/compose/resources/AndroidContextProvider$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jetbrains/compose/resources/AndroidContextProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lorg/jetbrains/compose/resources/AndroidContextProvider$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    invoke-static {}, Lorg/jetbrains/compose/resources/AndroidContextProvider;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lorg/jetbrains/compose/resources/AndroidContextProvider;->b(Landroid/content/Context;)V

    return-void
.end method
