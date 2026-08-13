.class public abstract LH9/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/C$a;
    }
.end annotation


# static fields
.field public static final C:LH9/C$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH9/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH9/C$a;-><init>(Ly7/k;)V

    sput-object v0, LH9/C;->C:LH9/C$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, LH9/C;->g()LX9/f;

    move-result-object v0

    invoke-static {v0}, LI9/d;->m(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract f()LH9/w;
.end method

.method public abstract g()LX9/f;
.end method
