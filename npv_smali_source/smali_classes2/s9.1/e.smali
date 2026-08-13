.class public abstract Ls9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ls9/b;

.field private static final b:Ls9/c;

.field private static final c:Ls9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls9/e$b;

    invoke-direct {v0}, Ls9/e$b;-><init>()V

    sput-object v0, Ls9/e;->a:Ls9/b;

    new-instance v0, Ls9/e$c;

    invoke-direct {v0}, Ls9/e$c;-><init>()V

    sput-object v0, Ls9/e;->b:Ls9/c;

    new-instance v0, Ls9/e$a;

    invoke-direct {v0}, Ls9/e$a;-><init>()V

    sput-object v0, Ls9/e;->c:Ls9/a;

    return-void
.end method

.method public static final synthetic a()Ls9/b;
    .locals 1

    sget-object v0, Ls9/e;->a:Ls9/b;

    return-object v0
.end method

.method public static final synthetic b()Ls9/c;
    .locals 1

    sget-object v0, Ls9/e;->b:Ls9/c;

    return-object v0
.end method
