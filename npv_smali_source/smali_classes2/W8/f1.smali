.class public final LW8/f1;
.super Lm7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW8/f1$a;
    }
.end annotation


# static fields
.field public static final E:LW8/f1$a;


# instance fields
.field public D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW8/f1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW8/f1$a;-><init>(Ly7/k;)V

    sput-object v0, LW8/f1;->E:LW8/f1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LW8/f1;->E:LW8/f1$a;

    invoke-direct {p0, v0}, Lm7/a;-><init>(Lm7/i$c;)V

    return-void
.end method
