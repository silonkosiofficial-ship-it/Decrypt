.class final LI4/o;
.super LI4/e;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LI4/x;


# direct methods
.method constructor <init>(Ljava/lang/String;LK4/x;Landroid/app/PendingIntent;)V
    .locals 0

    invoke-direct {p0}, LI4/e;-><init>()V

    iput-object p1, p0, LI4/o;->a:Ljava/lang/String;

    new-instance p1, LI4/x;

    invoke-direct {p1, p2, p3}, LI4/x;-><init>(LK4/x;Landroid/app/PendingIntent;)V

    iput-object p1, p0, LI4/o;->b:LI4/x;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI4/o;->a:Ljava/lang/String;

    return-object v0
.end method
