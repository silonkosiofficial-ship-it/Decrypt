.class public interface abstract LH9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH9/b$a;
    }
.end annotation


# static fields
.field public static final a:LH9/b$a;

.field public static final b:LH9/b;

.field public static final c:LH9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LH9/b$a;->a:LH9/b$a;

    sput-object v0, LH9/b;->a:LH9/b$a;

    new-instance v0, LH9/b$a$a;

    invoke-direct {v0}, LH9/b$a$a;-><init>()V

    sput-object v0, LH9/b;->b:LH9/b;

    new-instance v0, LJ9/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, LJ9/a;-><init>(LH9/q;ILy7/k;)V

    sput-object v0, LH9/b;->c:LH9/b;

    return-void
.end method


# virtual methods
.method public abstract a(LH9/D;LH9/B;)LH9/z;
.end method
