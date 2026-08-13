.class public final LS5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS5/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/g$a;
    }
.end annotation


# static fields
.field public static final b:LS5/g$a;


# instance fields
.field private final a:LF5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS5/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/g$a;-><init>(Ly7/k;)V

    sput-object v0, LS5/g;->b:LS5/g$a;

    return-void
.end method

.method public constructor <init>(LF5/b;)V
    .locals 1

    const-string v0, "transportFactoryProvider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/g;->a:LF5/b;

    return-void
.end method

.method public static synthetic b(LS5/g;LS5/z;)[B
    .locals 0

    invoke-direct {p0, p1}, LS5/g;->c(LS5/z;)[B

    move-result-object p0

    return-object p0
.end method

.method private final c(LS5/z;)[B
    .locals 3

    sget-object v0, LS5/A;->a:LS5/A;

    invoke-virtual {v0}, LS5/A;->c()Lz5/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lz5/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session Event Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LS5/z;->b()LS5/i;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "EventGDTLogger"

    nop

    sget-object p1, LS8/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(LS5/z;)V
    .locals 5

    const-string v0, "sessionEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS5/g;->a:LF5/b;

    invoke-interface {v0}, LF5/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW2/i;

    const-string v1, "json"

    invoke-static {v1}, LW2/b;->b(Ljava/lang/String;)LW2/b;

    move-result-object v1

    new-instance v2, LS5/f;

    invoke-direct {v2, p0}, LS5/f;-><init>(LS5/g;)V

    const-string v3, "FIREBASE_APPQUALITY_SESSION"

    const-class v4, LS5/z;

    invoke-interface {v0, v3, v4, v1, v2}, LW2/i;->a(Ljava/lang/String;Ljava/lang/Class;LW2/b;LW2/g;)LW2/h;

    move-result-object v0

    invoke-static {p1}, LW2/c;->f(Ljava/lang/Object;)LW2/c;

    move-result-object p1

    invoke-interface {v0, p1}, LW2/h;->a(LW2/c;)V

    return-void
.end method
