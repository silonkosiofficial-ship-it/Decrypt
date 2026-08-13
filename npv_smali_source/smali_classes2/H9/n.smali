.class public interface abstract LH9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/n$a;
    }
.end annotation


# static fields
.field public static final a:LH9/n$a;

.field public static final b:LH9/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LH9/n$a;->a:LH9/n$a;

    sput-object v0, LH9/n;->a:LH9/n$a;

    new-instance v0, LH9/n$a$a;

    invoke-direct {v0}, LH9/n$a$a;-><init>()V

    sput-object v0, LH9/n;->b:LH9/n;

    return-void
.end method


# virtual methods
.method public abstract a(LH9/u;Ljava/util/List;)V
.end method

.method public abstract b(LH9/u;)Ljava/util/List;
.end method
