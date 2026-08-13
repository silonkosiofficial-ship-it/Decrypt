.class public final LA/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LA/n$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lh0/c$b;)LA/n;
    .locals 1

    new-instance v0, LA/n$d;

    invoke-direct {v0, p1}, LA/n$d;-><init>(Lh0/c$b;)V

    return-object v0
.end method
