.class final LW8/F0$b;
.super LW8/E0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/F0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final G:LW8/F0;

.field private final H:LW8/F0$c;

.field private final I:LW8/t;

.field private final J:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LW8/F0;LW8/F0$c;LW8/t;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, LW8/E0;-><init>()V

    iput-object p1, p0, LW8/F0$b;->G:LW8/F0;

    iput-object p2, p0, LW8/F0$b;->H:LW8/F0$c;

    iput-object p3, p0, LW8/F0$b;->I:LW8/t;

    iput-object p4, p0, LW8/F0$b;->J:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 3

    iget-object p1, p0, LW8/F0$b;->G:LW8/F0;

    iget-object v0, p0, LW8/F0$b;->H:LW8/F0$c;

    iget-object v1, p0, LW8/F0$b;->I:LW8/t;

    iget-object v2, p0, LW8/F0$b;->J:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, LW8/F0;->p(LW8/F0;LW8/F0$c;LW8/t;Ljava/lang/Object;)V

    return-void
.end method
