.class final Lf8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LJ8/i;

.field private final b:LX7/y;

.field private final c:LJ8/n;


# direct methods
.method public constructor <init>(LJ8/i;LX7/y;LJ8/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8/a$a;->a:LJ8/i;

    iput-object p2, p0, Lf8/a$a;->b:LX7/y;

    iput-object p3, p0, Lf8/a$a;->c:LJ8/n;

    return-void
.end method


# virtual methods
.method public final a()LX7/y;
    .locals 1

    iget-object v0, p0, Lf8/a$a;->b:LX7/y;

    return-object v0
.end method

.method public final b()LJ8/i;
    .locals 1

    iget-object v0, p0, Lf8/a$a;->a:LJ8/i;

    return-object v0
.end method

.method public final c()LJ8/n;
    .locals 1

    iget-object v0, p0, Lf8/a$a;->c:LJ8/n;

    return-object v0
.end method
