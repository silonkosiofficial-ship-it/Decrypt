.class public final LS8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/g$a;,
        LS8/g$b;,
        LS8/g$c;
    }
.end annotation


# static fields
.field public static final d:LS8/g$b;

.field private static final e:LS8/g;

.field private static final f:LS8/g;


# instance fields
.field private final a:Z

.field private final b:LS8/g$a;

.field private final c:LS8/g$c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LS8/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS8/g$b;-><init>(Ly7/k;)V

    sput-object v0, LS8/g;->d:LS8/g$b;

    new-instance v0, LS8/g;

    sget-object v1, LS8/g$a;->j:LS8/g$a$a;

    invoke-virtual {v1}, LS8/g$a$a;->a()LS8/g$a;

    move-result-object v2

    sget-object v3, LS8/g$c;->h:LS8/g$c$a;

    invoke-virtual {v3}, LS8/g$c$a;->a()LS8/g$c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v0, v5, v2, v4}, LS8/g;-><init>(ZLS8/g$a;LS8/g$c;)V

    sput-object v0, LS8/g;->e:LS8/g;

    new-instance v0, LS8/g;

    invoke-virtual {v1}, LS8/g$a$a;->a()LS8/g$a;

    move-result-object v1

    invoke-virtual {v3}, LS8/g$c$a;->a()LS8/g$c;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, LS8/g;-><init>(ZLS8/g$a;LS8/g$c;)V

    sput-object v0, LS8/g;->f:LS8/g;

    return-void
.end method

.method public constructor <init>(ZLS8/g$a;LS8/g$c;)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "number"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LS8/g;->a:Z

    iput-object p2, p0, LS8/g;->b:LS8/g$a;

    iput-object p3, p0, LS8/g;->c:LS8/g$c;

    return-void
.end method

.method public static final synthetic a()LS8/g;
    .locals 1

    sget-object v0, LS8/g;->e:LS8/g;

    return-object v0
.end method


# virtual methods
.method public final b()LS8/g$c;
    .locals 1

    iget-object v0, p0, LS8/g;->c:LS8/g$c;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LS8/g;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HexFormat("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    upperCase = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, LS8/g;->a:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    bytes = BytesHexFormat("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, LS8/g;->b:LS8/g$a;

    const-string v3, "        "

    invoke-virtual {v2, v0, v3}, LS8/g$a;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    ),"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    number = NumberHexFormat("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, LS8/g;->c:LS8/g$c;

    invoke-virtual {v2, v0, v3}, LS8/g$c;->b(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, "    )"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
