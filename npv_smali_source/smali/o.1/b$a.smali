.class Lo/b$a;
.super Lo/b$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Lo/b$c;Lo/b$c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo/b$e;-><init>(Lo/b$c;Lo/b$c;)V

    return-void
.end method


# virtual methods
.method c(Lo/b$c;)Lo/b$c;
    .locals 0

    iget-object p1, p1, Lo/b$c;->F:Lo/b$c;

    return-object p1
.end method

.method d(Lo/b$c;)Lo/b$c;
    .locals 0

    iget-object p1, p1, Lo/b$c;->E:Lo/b$c;

    return-object p1
.end method
