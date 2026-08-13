.class public final Lb3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/b$a;
    }
.end annotation


# static fields
.field private static final b:Lb3/b;


# instance fields
.field private final a:Lb3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/b$a;

    invoke-direct {v0}, Lb3/b$a;-><init>()V

    invoke-virtual {v0}, Lb3/b$a;->a()Lb3/b;

    move-result-object v0

    sput-object v0, Lb3/b;->b:Lb3/b;

    return-void
.end method

.method constructor <init>(Lb3/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/b;->a:Lb3/e;

    return-void
.end method

.method public static b()Lb3/b$a;
    .locals 1

    new-instance v0, Lb3/b$a;

    invoke-direct {v0}, Lb3/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lb3/e;
    .locals 1

    iget-object v0, p0, Lb3/b;->a:Lb3/e;

    return-object v0
.end method
