.class public abstract Ln1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/i$a;
    }
.end annotation


# static fields
.field public static final a:Ln1/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/i$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/i;->a:Ln1/i$a;

    return-void
.end method
