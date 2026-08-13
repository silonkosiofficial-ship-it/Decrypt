.class public interface abstract LP9/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP9/l$a;
    }
.end annotation


# static fields
.field public static final a:LP9/l$a;

.field public static final b:LP9/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LP9/l$a;->a:LP9/l$a;

    sput-object v0, LP9/l;->a:LP9/l$a;

    new-instance v0, LP9/l$a$a;

    invoke-direct {v0}, LP9/l$a$a;-><init>()V

    sput-object v0, LP9/l;->b:LP9/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILP9/b;)V
.end method

.method public abstract b(ILjava/util/List;)Z
.end method

.method public abstract c(ILjava/util/List;Z)Z
.end method

.method public abstract d(ILX9/f;IZ)Z
.end method
