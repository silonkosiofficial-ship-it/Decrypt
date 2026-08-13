.class public interface abstract LI2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/m$b;
    }
.end annotation


# static fields
.field public static final a:LI2/m$b$c;

.field public static final b:LI2/m$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI2/m$b$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI2/m$b$c;-><init>(LI2/m$a;)V

    sput-object v0, LI2/m;->a:LI2/m$b$c;

    new-instance v0, LI2/m$b$b;

    invoke-direct {v0, v1}, LI2/m$b$b;-><init>(LI2/m$a;)V

    sput-object v0, LI2/m;->b:LI2/m$b$b;

    return-void
.end method
