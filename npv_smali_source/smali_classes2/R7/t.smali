.class public abstract LR7/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR7/t$a;
    }
.end annotation


# static fields
.field public static final C:LR7/t$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR7/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR7/t$a;-><init>(Ly7/k;)V

    sput-object v0, LR7/t;->C:LR7/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract M(LF8/l0;LG8/g;)Ly8/h;
.end method

.method protected abstract Q(LG8/g;)Ly8/h;
.end method
