.class public final Lh0/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic C:Lh0/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh0/k$b;

    invoke-direct {v0}, Lh0/k$b;-><init>()V

    sput-object v0, Lh0/k$b;->C:Lh0/k$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
