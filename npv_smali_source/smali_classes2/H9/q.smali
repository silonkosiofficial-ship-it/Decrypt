.class public interface abstract LH9/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/q$a;
    }
.end annotation


# static fields
.field public static final a:LH9/q$a;

.field public static final b:LH9/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LH9/q$a;->a:LH9/q$a;

    sput-object v0, LH9/q;->a:LH9/q$a;

    new-instance v0, LH9/q$a$a;

    invoke-direct {v0}, LH9/q$a$a;-><init>()V

    sput-object v0, LH9/q;->b:LH9/q;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Ljava/util/List;
.end method
