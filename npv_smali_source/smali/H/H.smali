.class public abstract LH/H;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/H$a;
    }
.end annotation


# static fields
.field public static final a:LH/H$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH/H$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH/H$a;-><init>(Ly7/k;)V

    sput-object v0, LH/H;->a:LH/H$a;

    return-void
.end method
