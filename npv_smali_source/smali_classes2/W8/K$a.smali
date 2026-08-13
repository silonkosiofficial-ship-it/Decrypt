.class public final LW8/K$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic C:LW8/K$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/K$a;

    invoke-direct {v0}, LW8/K$a;-><init>()V

    sput-object v0, LW8/K$a;->C:LW8/K$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
